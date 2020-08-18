package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseTwelve {
    public static void main(String[] args) {
       /* Se tiene en un arreglo veinte elementos representando calificaciones de los estudiantes
        de una escuela. Realice un algoritmo que lea el arreglo y calcule la calificación promedio
        del grupo, además, que cuente los estudiantes que obtuvieron calificaciones arriba del
        promedio del grupo.*/

        int[] notes;
        int averageNote;
        int sumAuxNotes;
        int amountAboveAverage;
        Scanner keyboard = new Scanner(System.in);

        notes = new int[20];
        sumAuxNotes = 0;
        averageNote = 0;
        amountAboveAverage = 0;

        for (int i = 0; i < notes.length; i++) {
            System.out.print("Ingrese la nota de lx alumnx n" + (i + 1) + ": ");
            notes[i] = keyboard.nextInt();
            sumAuxNotes = sumAuxNotes + notes[i];
        }

        averageNote = sumAuxNotes / 20;

        for (int i = 0; i < notes.length; i++) {
            if (notes[i] > averageNote) {
                amountAboveAverage += 1;
            }
        }

        System.out.println("El promedio de notas del grupo es " + averageNote);
        System.out.println(amountAboveAverage + " alumnos superan el promedio de la nota" );


    }

}
