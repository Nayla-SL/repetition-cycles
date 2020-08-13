package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseSix {

    public static void main(String[] args) {
        /*Realice un algoritmo que lea los nombres y las edades de diez alumnos, y que los datos se almacenen en dos
        vectores, y con base en esto se determine el nombre del alumno con la edad mayor del arreglo.*/

        int[] studentsAge = new int[10];
        String[] studentsName = new String[10];
        String olderStudent;
        int olderAge;
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el nombre y la edad de lx alumnx n" + i);
            studentsName[i] = keyboard.next();
            studentsAge[i] = keyboard.nextInt();
        }

        olderAge = 0;
        olderStudent = "";

        for (int i = 0; i < 9; i++) {
            if (olderAge < studentsAge[i]) {
                olderAge = studentsAge[i];
                olderStudent = studentsName[i];
            }
        }

        System.out.println(olderStudent + " tiene " + olderAge + " y eso lx hace lx alumnx de mayor edad.");

    }
}
