package ru.mpei.l3;

public class Car {
    private int releaseYear;
    private String color;
    private boolean sold;
    private String model;

    public Car(int releaseYear, String color, boolean sold){
        this.releaseYear = releaseYear;
        this.color = color;
        this.sold = sold;
    }

    public Car(){

    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        if (color.equals("green") || color.equals("red")) {
            this.color = color;
        } else {
            System.err.print("Not good color!");
        }
    }

    public String getColor(){
        return this.color;
    }
}
