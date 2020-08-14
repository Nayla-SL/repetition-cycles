package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseEight {

    public static void main(String[] args) {
     /*   Se tiene un arreglo de 5 filas y 2 columnas. Realice un algoritmo que permita leer el
        arreglo y que calcule y presente los resultados siguientes:
        El menor elemento del arreglo; la suma de los elementos de las tres primeras filas del
        arreglo; y el total de elementos negativos en las columnas de la quinta a la nueve.*/

        int[][] matrix = new int[5][2];
        int lowestNumber;
        int sumRows = 0;
        int negativeAmount = 0;
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Por favor ingrese el numero que corresponde a la fila %d, columna %d: ", i, j);
                matrix[i][j] = keyboard.nextInt();
            }
        }

        System.out.println("Su matriz es");
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.print(matrix [i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }


        lowestNumber = matrix[0][0];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                if (lowestNumber < matrix[i][j]) {
                    lowestNumber = matrix[i][j];
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                sumRows = sumRows + matrix[i][j];
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                if (matrix[i][j] < 0) {
                    negativeAmount = negativeAmount + 1;
                }
            }
        }

        System.out.println("El menor numero de la matriz es " + lowestNumber);
        System.out.println("En esta matriz hay " + negativeAmount + " numeros negativos");
        System.out.println("El resultado de la suma de las tres primeras filas es " + sumRows);
    }
}
