package com.company;

public abstract class Vehicle {
        private int year;
        private String brand;
        private String model;
        private float price;
        private String color;

    public Vehicle(){
        year = 0;
        brand = "";
        model = "";
        price = 0;
        color = "";

    }
    public Vehicle(int year,String brand,String model,float price,String color ){
            this.year = year;
            this.brand = brand;
            this.model = model;
            this.price = price;
            this.color = color;

    }
    public double getYear() {
        return year;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public float getPrice() {
        return price;
    }
    public void setYear(int year) {
        this.year=year;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setyearbrandmodelpricecolor(int year,String model,String brand,String color ,float  price) {
        this.year=year;
        this.model=model;
        this.brand=brand;
        this.price = price;
        this.color = color;
    }
    @Override
    public String toString() {
        return "(" + getYear() + " , " + getBrand()  + " , " + getModel() + " , "+ getPrice() + " , " + getColor() + ")";
    }




}
