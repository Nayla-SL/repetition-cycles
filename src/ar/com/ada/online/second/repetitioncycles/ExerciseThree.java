package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        /*Lea un arreglo de M filas y N columnas y que calcule la suma de los elementos de la
        diagonal principal*/

        int resultSum;
        int [][] matrix;
        Scanner keyboard = new Scanner(System.in);
        int rowsAmount;
        int columnsAmount;

        System.out.print("Ingrese la cantidad de filas que tiene su Matriz: ");
        rowsAmount = keyboard.nextInt();

        System.out.print("Ingrese la cantidad de columnas que tiene su Matriz: ");
        columnsAmount = keyboard.nextInt();

        matrix = new int[rowsAmount][columnsAmount];

        for (int i = 0; i <rowsAmount ; i++) {
            for (int j = 0; j <columnsAmount ; j++) {
                System.out.print("Ingrese el numero de la fila: " + i + ", columna: "+ j + ": ");
                matrix [i][j] = keyboard.nextInt();
            }
        }

        resultSum = 0;

        for (int i = 0; i <rowsAmount ; i++) {
            resultSum = resultSum + matrix [i][i];
        }

        System.out.println("El resultado de la suma de la diagonal principal es: " + resultSum );



    }

}
