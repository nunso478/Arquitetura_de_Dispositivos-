package com.company;

public class NumericalUtilities {
    public static double powerOf(double base, double expo) {
        return  Math.pow(base,expo);
    }
    public static int sumof(int value) {
        int sum = 0;
        for(int i = 0; i <= value;i++){
            sum += i;
        }
        return sum;
    }

    public static int sumofBetween(int value,int value2) {
        int sum = 0;
        for(int i = value; i <= value2;i++){
            sum += i;
        }
        return sum;

    }

    public static int sumoffEvenNumbers(int value) {
        int sum = 0;
        for(int i = 1; i <= value;i++){
            if (value % i == 0)
            {
                sum += i;
            }

        }
        return sum;
    }

    public static int sumoOfDivisors(int value) {
        int sum = 0;
        for(int i = 1; i <= value;i++){
            if (value % i == 0)
            {
                sum++;
            }

        }
        return sum;
    }
/*
    public static int isPrime(int value) {
           if(sumoOfDivisors(value) == 2) {
               return true;
           }
           return false;
    }*/
}
