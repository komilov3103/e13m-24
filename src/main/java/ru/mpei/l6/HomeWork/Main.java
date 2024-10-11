package ru.mpei.l6.HomeWork;

import ru.mpei.l6.HomeWork.exceptions.DataException;
import ru.mpei.l6.HomeWork.exceptions.EmptyDataException;
import ru.mpei.l6.HomeWork.exceptions.UnknownCharacterException;

public class Main {
    public static void main(String[] args){
        StringDataValidator sdv = new StringDataValidator();
        test("hello", "hello", sdv);
        test("hello", "hi", sdv);
        test("привет", "привет", sdv);
        test("hi", "", sdv);

    }
    public static void test(String first, String second, StringDataValidator sdv){
        try {
            System.out.println(sdv.validate(first, second));
        } catch (UnknownCharacterException e){
            e.printStackTrace();
            System.err.println("Input string contains non english letter");
        } catch (EmptyDataException e){
            e.printStackTrace();
            System.out.println("Input string is null or empty");
        } catch (DataException e){
            e.printStackTrace();
        }
    }
}
