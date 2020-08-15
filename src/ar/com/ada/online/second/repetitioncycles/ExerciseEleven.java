package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseEleven {
    public static void main(String[] args) {
     /*   Se tiene una matriz de 5 filas por 9 columnas y se desea un algoritmo para encontrar
        todos sus elementos negativos y para que les cambie ese valor negativo por un cero.*/

        int[][] matrixA = new int[5][9];
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.printf("Ingrese el numero que corresponde a la fila %d, columna %d: ", i, j);
                matrixA[i][j] = keyboard.nextInt();
            }
        }

        System.out.println("Su matriz actual es: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matrixA[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (matrixA[i][j] < 0) {
                    matrixA[i][j] = 0;
                }
            }
        }

        System.out.println("La matriz positiva es: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matrixA[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }


    }
}
