package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        /*Realice un algoritmo para determinar si una matriz es de tipo diagonal:
        es una matriz cuadrada en la cual todos sus elementos son cero,
        excepto los electos de la diagonal principal.*/

        int rowsAmount;
        int columnsAmount;
        int[][] matrix;
        boolean diagonal = true;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de filas de su matriz: ");
        rowsAmount = keyboard.nextInt();
        System.out.print("Ingrese la cantidad de columnas de su matriz: ");
        columnsAmount = keyboard.nextInt();

        if (rowsAmount != columnsAmount) {
            System.out.printf("La matriz no es cuadrada.");
            System.exit(0);
        }

        matrix = new int[rowsAmount][columnsAmount];

        for (int i = 0; i < rowsAmount; i++) {
            for (int j = 0; j < columnsAmount; j++) {
                System.out.print("Ingrese el numero que corresponde a la fila "+ i + ", columna " + j + ": ");
                matrix[i][j] = keyboard.nextInt();
            }
        }

        System.out.println("Su matriz es: ");
        for (int i = 0; i < rowsAmount; i++) {
            for (int j = 0; j < columnsAmount; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }

        for (int i = 0; i < rowsAmount; i++) {
            for (int j = 0; j < columnsAmount; j++) {
                if (i == j) {
                    if (matrix[i][j] == 0) {
                        diagonal = false;
                    } else {
                        diagonal = true;
                    }
                } else {
                    if (matrix[i][j] == 0) {
                        diagonal = true;
                    } else {
                        diagonal = false;
                    }
                }
            }
        }

        if (diagonal) {
            System.out.print("Su matriz es de tipo diagonal");
        } else {
            System.out.print("Su matriz NO es de tipo diagonal");
        }

    }

}
