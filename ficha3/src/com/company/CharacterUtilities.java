package com.company;

public class CharacterUtilities {


    public static char lowerLetterSuccessorOf(char original) {
        if (original == 'z'){
            return 'a';
        }
        else {
            int code = (int) original;
            code++;
            char next = (char) code;
            return next;
        }
    }

    public static char lowerLetterPredecessorOf(char original) {
        if (original == 'z'){
            return 'a';
        }
        else {
            int code = (int) original;
            code--;
            char next = (char) code;
            return next;
        }
    }

    public static char lowerLetterSuccessorStepsOf(char original, int value) {

        int i = 0;
        char next = original;
        while (i < value)
        {
            next = lowerLetterSuccessorOf(next);
            i++;


        }
        return next;
    }

    public static char lowerLetterPredecessorStepsOf(char original, int value) {
        int i = 0;
        char next = original;
        while (i < value)
        {
            next = lowerLetterPredecessorOf(next);
            i++;


        }
        return next;
    }


    public static int occurrencesOfCharacterIn(char[] letter1, char a) {
        int count = 0;
        for (int i = 0; i < letter1.length;  i++) {
            if (letter1[i] == a){
                count++;
            }
        }
        return count;
    }


    public static char[] replaceCharacterIn(char[] array, char charold, char newchar) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == charold) {
                array[i] = newchar;
            }
        }
        return array;
    }

    public static char[] concatenationOf(char[] array1, char[] array2) {
        char[] array = new char[array1.length +array2.length];
        for (int i = 0; i < array1.length; i++) {
            array[i] = array1[i];

        }
        for (int i = 0; i < array2.length; i++) {
            array[i + array1.length] = array2[i];

        }
        return array;
    }

    public static char[] copyOfPartOf(char[] array1, int value,int value2) {
        char[] copy = new char[(value-value2)+1];
        int index = 0;
        for (int j = value; j <  value2; j++) {
            copy[index] = array1[j];
            index++;


        }
        return copy;
    }
    public static String cipher(String str,int steps){
        String cipheredStr = "";
        for (int i = 0; i < str.length(); i++) {
            cipheredStr += lowerLetterSuccessorOf(str.charAt(i),steps);
        }
        return cipheredStr;
    }
    public static String dipher(String str,int steps){
        String dipheredStr = "";
        for (int i = 0; i < str.length(); i++) {
            dipheredStr += lowerLetterPredecessorOf(str.charAt(i) , steps);
        }
        return dipheredStr;
    }
}
