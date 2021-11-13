package com.company;

public class ArrayUtilities {

    public static String toString(int[] array) {
        String str ="[";
        for (int i = 0; i< array.length; i++)
        {
           str += array[i] + ",";

        }
        str+="]";
        return str;
    }

    public static int maximumOf(int[] array) {
        int max = array[0];
        for (int i = 0; i< array.length; i++)
        {
         if(array[i]> max)
         {
             max = array[i];
         }

        }
        return max;
    }

    public static int minimumOf(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] < min)
            {
                min = array[i];
            }

        }
        return min;
    }


    public static int[] copyOf(int[] array) {
        int[] copyarray = new int[array.length];
        for (int i = 0; i < array.length; i++)
        {
            copyarray[i] = array[i];
        }
        return copyarray;

    }


    public static boolean contains(int[] array, int value) {

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == value)
            {
                return true;
            }

        }
        return false;
    }

    public static boolean containsDuplicates(int[] array) {

        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array.length;j++){
                if (array[i] == array[j] && i != j )
                {
                    return true;
                }
            }
        }
        return false;

    }

    public static int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == value)
            {
                return i;
            }

        }
        return -1;
    }

    public static int[] add(int[] array, int value) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length -1] = value;
        return newArray;

    }

    public static int[] remove(int[] array, int value) {
        int index = indexOf(array,value);
        if(index == -1)
        {
          return  array;
        }
        else {
            int[] array_r = new int[array.length -1];
            for (int i = 0; i < array.length; i++) {
                if (i < index){
                    array_r[i] = array[i];
                }
                else if (i != index){
                    array_r[i - 1] = array[i];
                }

            }
            return  array_r;
        }
    }
}
