package ar.com.ada.online.second.repetitioncycles;

import java.sql.SQLOutput;
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

        if (columnsAmountMatrixA != rowsAmountMatrixB){
            System.out.println("Estas matrices no se podran multiplicar.");
            return;
        }

        for (int i = 0; i < rowsAmountMatrixA; i++) {
            for (int j = 0; j < columnsAmountMatrixA; j++) {
                System.out.println("Ingrese el numero de la matriz A, fila: " + i + ", columna: " + j);
                matrixA[i][j] = keyboard.nextInt();
            }
        }
        for (int i = 0; i < rowsAmountMatrixB; i++) {
            for (int j = 0; j < columnsAmountMatrixB; j++) {
                System.out.println("Ingrese el numero de la matriz B, fila: " + i + ", columna: " + j);
                matrixB[i][j] = keyboard.nextInt();
            }
        }

        for (int rows = 0; rows <rowsAmountMatrixA ; rows++) {
            for (int columns = 0; columns <columnsAmountMatrixB ; columns++) {
                productMatrix [rows][columns] = matrixA [rows][columns] * matrixB[columns][rows];
            }

        }


    }
}
