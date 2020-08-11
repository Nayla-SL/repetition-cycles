package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseOne {

    public static void main(String[] args) {
//        Obtener la matriz transpuesta de cualquier matriz de orden M x N.


        int rowsMatrixAmount;
        int columnsMatrixAmount;
        int[][] initialMatrix;
        int[][] transposedMatrix;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de filas: ");
        rowsMatrixAmount = keyboard.nextInt();


        System.out.print("Ingrese la cantidad de columnas: ");
        columnsMatrixAmount = keyboard.nextInt();

        initialMatrix = new int[rowsMatrixAmount][columnsMatrixAmount];
        transposedMatrix = new int[columnsMatrixAmount][rowsMatrixAmount];


        for (int i = 0; i < rowsMatrixAmount; i++) {
            for (int j = 0; j < columnsMatrixAmount; j++) {
                System.out.print("Ingrese el número que pertenece a la fila; " + i + ", columna :" + j + ": ");
                initialMatrix[i][j] = keyboard.nextInt();
            }
        }

        System.out.println("La matriz actual es: ");
        for (int i = 0; i < rowsMatrixAmount; i++) {
            for (int j = 0; j < columnsMatrixAmount; j++) {
                System.out.print(initialMatrix[i][j]);
                System.out.print("|");
            }
            System.out.println();
        }

        for (int i = 0; i < columnsMatrixAmount; i++) {
            for (int j = 0; j < rowsMatrixAmount; j++) {
                transposedMatrix[i][j] = initialMatrix[j][i];
            }
        }

        System.out.println("La nueva matriz es: ");
        for (int i = 0; i < columnsMatrixAmount; i++) {
            for (int j = 0; j < rowsMatrixAmount; j++) {
                System.out.print(transposedMatrix[i][j]);
                System.out.print("|");
            }
            System.out.println();
        }

    }

}
