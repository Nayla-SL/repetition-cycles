package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {

      /*  Realice un algoritmo que lea un vector y a partir de él forme un segundo vector, de tal
        forma que el primer elemento pase a ser el segundo, el segundo pase a ser el tercero, el
        último pase a ser el primero, y así sucesivamente.*/

        int vectorA [];
        int vectorB [];
        int vectorLenght;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el largo de su vector: " );
        vectorLenght = keyboard.nextInt();

        vectorA = new int[vectorLenght+1];
        vectorB = new int[vectorLenght];


        for (int i = 0; i <vectorLenght ; i++) {
            System.out.print("Por favor, ingrese el numero que corresponda a la ubicacion " + i + " de su vector: ");
            vectorA[i] = keyboard.nextInt();
        }


        for (int i = 0; i < vectorLenght ; i++) {
            vectorB[i] = vectorA[i+1];
        }
        vectorB [vectorLenght -1] = vectorA[0];

        System.out.println("El nuevo vector es");
        for (int i = 0; i <vectorLenght ; i++) {
            System.out.print(vectorB[i]+ " | ");
        }

    }

}
