package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseFourteen {
    public static void main(String[] args) {
        /*Realice un algoritmo que lea una matriz de cinco filas y seis columnas y que cuente los
        elementos negativos que contiene, así como también cuántos elementos de la diagonal
        principal son igual a cero. Represéntelo mediante diagrama de flujo y pseudocódigo*/

        int[][] matrix = new int[5][6];
        int negAmount = 0;
        int zeroDiagonal = 0;
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Ingrese el numero que corresponde a la fila " + i + ", columna " + j + ": ");
                matrix[i][j] = keyboard.nextInt();
            }
        }

        System.out.println("Su matriz es:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] == 0) {
                zeroDiagonal = zeroDiagonal + 1;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    negAmount = negAmount + 1;
                }
            }
        }

        System.out.println("Hay " + zeroDiagonal + " ceros en la diagonal principal");
        System.out.println("Hay " + negAmount + " numeros negativos en la matriz");

    }
}
