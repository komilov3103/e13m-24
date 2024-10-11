package ru.mpei.l5.HomeWork;


public class Main {
    public static void main(String[] args){
        SteroidArray ArrayOfStrings = new SteroidArray(10);
        ArrayOfStrings.add("somestring");
        System.out.println(ArrayOfStrings);
        ArrayOfStrings.remove("somestring");
        ArrayOfStrings.remove(0);
        System.out.println(ArrayOfStrings);
        System.out.println(ArrayOfStrings.length());
        System.out.println(ArrayOfStrings.maxLength());
    }
}
