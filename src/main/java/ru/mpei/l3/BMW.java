package ru.mpei.l3;

public class BMW extends Car implements Drivable{

    @Override
    public void drive() {
        System.out.println("BMW is being driven");
    }
}
