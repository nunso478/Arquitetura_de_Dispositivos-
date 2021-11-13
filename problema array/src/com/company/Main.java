package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        final int[] studentNumbers = {20032,30312,25342,31432};
        final String[] courseAcronyms = { "AD", "WEB-FE", "WEB-BE"};
        final int[][] studentGrades = {
                {15, 18, 17},
                {18, 10, 11}, // grades of student 30312
                {11, 13, 15},
                {10, 19, 16}
        };

        for (int i = 0; i < studentNumbers.length; i++) {
            double sumOfGrades = 0.0;
            System.out.println("Aluno " + studentNumbers[i]);
            for (int j = 0; j < studentGrades[i].length; j++) {
                System.out.println(courseAcronyms[j] + " : " + studentGrades[i][j]);
                sumOfGrades += studentGrades[i][j];
            }
            double averageOfGrades = sumOfGrades / studentGrades[i].length;
            System.out.println("Media: "+ averageOfGrades);
            System.out.println();
        }





    }
}
