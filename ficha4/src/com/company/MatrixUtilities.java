package com.company;

public class MatrixUtilities {


    public static void show(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] +" " );
            }
            System.out.println();
        }

    }


    public static boolean isMatrix(int[][] matrix) {
        int colums = matrix[0].length;
        for (int i = 1; i < matrix.length; i++) {

                if (matrix[i].length != colums){
                    return false;
                }
        }
        return true;
    }

    public static boolean isIdentity(int[][] matri) {
        for (int i = 0; i < matri.length; i++) {
            for (int j = 0; j < matri[i].length; j++) {
                if (i == j) {
                    if (matri[i][j] != 1) {
                        return false;
                    }
                } else {
                    if (matri[i][j] != 0) {
                        return false;
                    }
                }

            }

        }
        return true;
    }

    public static int[][] multiplyBy(int[][] matri,int value) {
        int[][] product = new int[matri.length][matri[0].length];
        for (int i = 0; i < matri.length; i++) {
            for (int j = 0; j < matri[i].length; j++) {

                product[i][i] = matri[i][j] * value;
            }


        }
        return product;
    }


    public static boolean areCompatibleForSum(int[][] matri, int[][] matr) {
       if (isMatrix(matr) && isMatrix(matri)){
           int lineA = matri.length;
           int lineB = matr.length;
           int columsA = matri[0].length;
           int columsB = matr[0].length;
           if (lineA == lineB && columsA == columsB){
               return true;
           }
           else {
               return false;
           }
       }
       else
           return false;

    }

    public static int[][] sumOf(int[][] matri, int[][] matr) {
        int[][] sum = new int[matri.length][matri[0].length];

       if(areCompatibleForSum(matr,matri)) {
           for (int i = 0; i < matri.length; i++) {
               for (int j = 0; j < matri[i].length; j++) {
                   sum[i][j] = matr[i][j] + matri[i][j];
               }
           }
       }
       return sum;
    }
}
