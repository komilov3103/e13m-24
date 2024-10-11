package ru.mpei.l3;


public class Lecture3 {
    public static void main(String[] args) {

        MyOptional<BMW> bmwOptional = MyOptional.of(new BMW());
        BMW bmw = bmwOptional.get();

        bmw.drive();
    }
}
