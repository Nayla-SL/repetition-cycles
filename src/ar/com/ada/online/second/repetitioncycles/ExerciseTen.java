package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseTen {
    public static void main(String[] args) {
       /* Se tienen dos matrices cuadradas (de 5 filas y 5 columnas cada una). Realice un
        algoritmo que lea los arreglos y que determine si la diagonal principal de la primera es
        igual a la diagonal principal de la segunda. (Diagonal principal es donde los subíndices I,
        J son iguales).*/

        int[][] matrixA = new int[5][5];
        int[][] matrixB = new int[5][5];
        boolean diagonal = true;
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Ingrese de la matriz A, el numero que corresponde a la fila %d, columna %d: ", i, j);
                matrixA[i][j] = keyboard.nextInt();
                System.out.println();
            }
        }


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Ingrese de la matriz B, el numero que corresponde a la fila %d, columna %d: ", i, j);
                matrixB[i][j] = keyboard.nextInt();
                System.out.println();
            }
        }

        System.out.println("El vector A es: ");
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5; j++) {
                System.out.print(matrixA[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }

        System.out.println("El vector B es: ");
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5; j++) {
                System.out.print(matrixB[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            if (matrixA[i][i] != matrixB[i][i]) {
                diagonal = false;
            }
        }
         if (diagonal){
             System.out.printf("Las diagonales de las matrices son iguales.");
         } else {
             System.out.printf("Las diagonales de las matrices no son iguales.");
         }

    }


}
