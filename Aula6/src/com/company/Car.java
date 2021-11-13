package com.company;

public class Car extends Vehicle {
    private int doors;

    public Car(){
        super();
        doors = 0;

    }
    public  Car(int year,String brand,String model,float price,String color,int doors){
        super(year, brand, model, price, color);
        this.doors = doors;


    }
    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    @Override
    public String toString() {
        return "(" + super.toString() + "," +  getDoors() + ")";
    }






}
