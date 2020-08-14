package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseNine {
    public static void main(String[] args) {
        /*Realice un algoritmo que lea dos vectores de diez elementos y que calcule la suma de
        éstos guardando su resultado en otro vector, el cual se debe presentar en forma
        impresa.*/

        int[] vectorA = new int[10];
        int[] vectorB = new int[10];
        int[] vectorResult = new int[10];
        Scanner keyboard = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {
            System.out.printf("Ingrese el numero correspondiente a la posicion %d del primer vector: ", i);
            vectorA[i] = keyboard.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("Ingrese el numero correspondiente a la posicion %d del segundo vector: ", i);
            vectorB[i] = keyboard.nextInt();
        }

        System.out.println("Este es el primer vector");
        for (int i = 0; i < 10; i++) {
            System.out.print(" | " + vectorA[i]);
        }
        System.out.println();
        System.out.println("Este es el segundo vector");
        for (int i = 0; i < 10; i++) {
            System.out.print(" | " + vectorB[i]);
        }


        for (int i = 0; i < 10; i++) {
            vectorResult[i] = vectorA[i] + vectorB[i];
        }

        System.out.println();
        System.out.println("Este es el vector con los resultados de la suma");
        for (int i = 0; i < 10; i++) {
            System.out.print(" | " + vectorResult[i]);
        }


    }
}
