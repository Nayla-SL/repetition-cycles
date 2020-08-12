package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseTwo {

    public static void main(String[] args) {

//        Obtener el producto de dos matrices de orden M x N y P x Q.


        int rowsAmountMatrixA;
        int rowsAmountMatrixB;
        int columnsAmountMatrixA;
        int columnsAmountMatrixB;
        int[][] matrixA;
        int[][] matrixB;
        int[][] productMatrix;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de filas de la Matriz A:");
        rowsAmountMatrixA = keyboard.nextInt();
        System.out.print("Ingrese la cantidad de columnas de la Matriz A:");
        columnsAmountMatrixA = keyboard.nextInt();
        System.out.print("Ingrese la cantidad de filas de la Matriz B:");
        rowsAmountMatrixB = keyboard.nextInt();
        System.out.print("Ingrese la cantidad de columnas de la Matriz B:");
        columnsAmountMatrixB = keyboard.nextInt();

        matrixA = new int[rowsAmountMatrixA][columnsAmountMatrixA];
        matrixB = new int[rowsAmountMatrixB][columnsAmountMatrixB];
        productMatrix = new int[rowsAmountMatrixA][columnsAmountMatrixB];

        if (columnsAmountMatrixA != rowsAmountMatrixB) {
            System.out.println("Estas matrices no se podran multiplicar.");
            return;
        }

        for (int i = 0; i < rowsAmountMatrixA; i++) {
            for (int j = 0; j < columnsAmountMatrixA; j++) {
                System.out.print("Ingrese el numero de la matriz A, fila: " + i + ", columna: " + j + ": ");
                matrixA[i][j] = keyboard.nextInt();
            }
        }
        for (int i = 0; i < rowsAmountMatrixB; i++) {
            for (int j = 0; j < columnsAmountMatrixB; j++) {
                System.out.print("Ingrese el numero de la matriz B, fila: " + i + ", columna: " + j + ": ");
                matrixB[i][j] = keyboard.nextInt();
            }
        }
        System.out.println("La matriz A es: ");
        for (int i = 0; i < rowsAmountMatrixA; i++) {
            for (int j = 0; j < columnsAmountMatrixA; j++) {
                System.out.print(matrixA[i][j]);
                System.out.print("|");
            }
            System.out.println();
        }
        System.out.println("La matriz B es: ");
        for (int i = 0; i < rowsAmountMatrixB; i++) {
            for (int j = 0; j < columnsAmountMatrixB; j++) {
                System.out.print(matrixB[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }

        for (int i = 0; i < rowsAmountMatrixA; i++) {
            for (int j = 0; j < columnsAmountMatrixB; j++) {
                productMatrix[i][j] = 0;
            }
        }


        for (int i = 0; i < rowsAmountMatrixA; i++) {
            for (int j = 0; j < columnsAmountMatrixB; j++) {
                for (int k = 0; k < columnsAmountMatrixA; k++) {
                    productMatrix[i][j] = productMatrix[i][j] + (matrixA[i][k] * matrixB[k][j]);
                }
            }

        }

        System.out.println("La matriz de productos es: ");
        for (int i = 0; i < rowsAmountMatrixA; i++) {
            for (int j = 0; j < columnsAmountMatrixB; j++) {
                System.out.print(productMatrix[i][j]);
                System.out.printf("|");
            }
            System.out.println();
        }

    }

}



