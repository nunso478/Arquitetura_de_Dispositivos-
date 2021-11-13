package com.company;

public class Motorcycle extends Vehicle{
     private int tyre;

    public Motorcycle(){
        super();
        tyre = 0;

    }
    public  Motorcycle(int year,String brand,String model,float price,String color,int tyre){
        super(year, brand, model, price, color);
        this.tyre = tyre;


    }
    public int getTyre() {
        return tyre;
    }
    public void setTyre(int tyre) {
        this.tyre = tyre;
    }
    @Override
    public String toString() {
        return "(" + super.toString() + " , " +  getTyre() + ")";
    }
}
