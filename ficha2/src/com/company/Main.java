package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
       /* double power = NumericalUtilities.powerOf(2,2);
        int sum = NumericalUtilities.sumof(10);
        int sumBetween  = NumericalUtilities.sumofBetween(5,10);
        int sumfEvenNumbers  = NumericalUtilities.sumoffEvenNumbers(12);
        int sumfDivisors = NumericalUtilities.sumoOfDivisors(6);
        int Prime = NumericalUtilities.isPrime(6); */
        // System.out.println(power);
        // System.out.println(sum);
        //System.out.println(sumBetween);
        //System.out.println(sumfEvenNumbers);
        //System.out.println(sumfDivisors);
        //System.out.println(Prime);
       int[] array = {1,2,3,4,5,6};
       int[] array2 = new int[6];
        //String str = ArrayUtilities.toString(array);
        //System.out.println(str);
       // int strmax = ArrayUtilities.maximumOf(array);
        //System.out.println(strmax);
       // int strmin = ArrayUtilities.minimumOf(array);
        //System.out.println(strmin);
        //int[] strcopy = ArrayUtilities.copyOf(array);
       // System.out.println(ArrayUtilities.toString(strcopy));
       // boolean strcontains = ArrayUtilities.contains(array,4);
       // System.out.println(strcontains);
       // boolean strcontainsDuplicates = ArrayUtilities.containsDuplicates(array);
      //  System.out.println(strcontainsDuplicates);
       int strindex = ArrayUtilities.indexOf(array,7);
        System.out.println(strindex);
        //int[] stradd = ArrayUtilities.add(array,2);
        int[] strremove = ArrayUtilities.remove(array,2);
        System.out.println(ArrayUtilities.toString( strremove));

    }
}


