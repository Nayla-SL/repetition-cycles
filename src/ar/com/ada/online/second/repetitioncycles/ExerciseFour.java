package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseFour {

    public static void main(String[] args) {
        /* Realice un algoritmo para obtener una matriz como el resultado de la resta de dos matrices de orden M x N.*/

        int rowsAmountMatrix;
        int columnsAmountMatrix;
        int[][] matrixA;
        int[][] matrixB;
        int[][] resultMatrix;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Por favor, tenga en cuenta que para este ejercicio, ambas matrices deben ser del mismo tamaño.");
        System.out.print("Ingrese la cantidad de filas que tienen sus matrices: ");
        rowsAmountMatrix = keyboard.nextInt();
        System.out.print("Ingrese la cantidad de columnas que tienen sus matrices: ");
        columnsAmountMatrix = keyboard.nextInt();
              


        matrixA = new int[rowsAmountMatrix][columnsAmountMatrix];
        matrixB = new int[rowsAmountMatrix][columnsAmountMatrix];
        resultMatrix = new int[rowsAmountMatrix][columnsAmountMatrix];


        for (int i = 0; i < rowsAmountMatrix; i++) {
            for (int j = 0; j < columnsAmountMatrix; j++) {
                System.out.print("Ingrese el numero correspondiente a la matriz A > fila " + i + ", columna " + j + ": ");
                matrixA[i][j] = keyboard.nextInt();
            }
        }

        for (int i = 0; i < rowsAmountMatrix; i++) {
            for (int j = 0; j < columnsAmountMatrix; j++) {
                System.out.print("Ingrese el numero correspondiente a la matriz B > fila " + i + ", columna " + j + ": ");
                matrixB[i][j] = keyboard.nextInt();
            }
        }

        System.out.println("La matriz A es: ");
        for (int i = 0; i < rowsAmountMatrix; i++) {
            for (int j = 0; j < columnsAmountMatrix; j++) {
                System.out.print(matrixA[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }

        System.out.println("La matriz B es: ");
        for (int i = 0; i < rowsAmountMatrix; i++) {
            for (int j = 0; j < columnsAmountMatrix; j++) {
                System.out.print(matrixB[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }

        for (int i = 0; i < rowsAmountMatrix; i++) {
            for (int j = 0; j < columnsAmountMatrix; j++) {
                resultMatrix[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }


        System.out.println("La matriz resultante es: ");
        for (int i = 0; i < rowsAmountMatrix; i++) {
            for (int j = 0; j < columnsAmountMatrix; j++) {
                System.out.print(resultMatrix[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }


    }
}
