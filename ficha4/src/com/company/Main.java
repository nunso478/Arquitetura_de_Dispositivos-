package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] matrix = new int[3][4];
        int[][] matri = {{1,2,2},{3,1,2},{4,5,6}};
        int[][] matr = {{1,2,2},{3,1,2},{4,5,6}};
        MatrixUtilities.show(matrix);
        System.out.println();
      // boolean ismetrix = MatrixUtilities.isMatrix(matrix);
        //System.out.println(ismetrix);
        boolean isIdentity = MatrixUtilities.isIdentity(matri);
        //System.out.println(isIdentity);
        int[][] multiplyBy = MatrixUtilities.multiplyBy(matri,2);
        //System.out.println(MatrixUtilities.show(multiplyBy));
        boolean areCompatibleForSum = MatrixUtilities.areCompatibleForSum(matri,matr);
       // System.out.println(areCompatibleForSum);
        int[][] sumOf = MatrixUtilities.sumOf(matri,matr);
        //System.out.println(MatrixUtilities.show(sumOf));
         char Element = CharacterDrawingUtilities.drawElement('*');
        System.out.println(Element);

    }

}
