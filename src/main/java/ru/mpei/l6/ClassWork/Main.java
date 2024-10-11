package ru.mpei.l6.ClassWork;

public class Main {
    public static void main(String[] args){

        ModelCalculator mc = new ModelCalculator();
        try {
            mc.calc(new String[]{"node1", "node2"}, new String[]{"link1"});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
