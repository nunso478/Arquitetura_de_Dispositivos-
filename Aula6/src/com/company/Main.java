package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vehicle car = new Car(1922,"audi","r8",19204,"black",12);
        Vehicle motorcycle = new Motorcycle(2021,"HondaNx650","1000",19204,"black",2);
        System.out.println(car);
        System.out.println(motorcycle);
    }
}
