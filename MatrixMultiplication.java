//nxn matrix multiplied by another nxn matrix to produce a new matrix
//multiply the i-th row in A by the j-th column in B to produce a single point in C
//takes n^3 operations to do the algorithm
//best-case == worst-case == average-case == n^3
//there are no comparisons, just multiplication

import java.util.Random;

public class MatrixMultiplication {
    public static void main(String[] args) {

        int[][] matrixA = new int[3][3];
        int[][] matrixB = new int[3][3];
        fillMatrix(matrixA);
        fillMatrix(matrixB);
        int[][] matrixC = new int[3][3];
        matrixC = multiply2DArrays(matrixA,matrixB);
        System.out.println("Matrix A: ");
        printMatrix(matrixA);
        System.out.println("Matrix B: ");
        printMatrix(matrixB);
        System.out.println("Matrix C: ");
        printMatrix(matrixC);

    }

    public static int[][]  multiply2DArrays(int[][] matrixA, int[][] matrixB) {

        int[][] matrixFinal = new int[3][3];

        for(int i = 0; i < matrixA.length; i++)
            for(int j = 0; j < matrixA.length; j++) {
                int countingTotal = 0; //counter
                for (int k = 0; k < matrixB.length; k++)
                    countingTotal += (matrixA[i][k] * matrixB[k][j]);

                matrixFinal[i][j] = countingTotal;
            }
        return matrixFinal;
    }

    public static void fillMatrix(int[][] matrixZ) {
        Random rand = new Random();
        int numb;

        for(int i = 0; i < matrixZ.length; i++) {
            for (int j = 0; j < matrixZ[i].length; j++) {
                numb = rand.nextInt(10);
                matrixZ[i][j] = numb;
            }
        }
    }

    public static void printMatrix(int[][] matrixZ) {
        for(int i = 0; i < matrixZ.length; i++) {
            for (int j = 0; j < matrixZ[i].length; j++)
                System.out.print(matrixZ[i][j] + " ");
            System.out.println();
        }
    }

}
