package javaapplication7;

import java.util.Scanner;

public class Ejercicio15_2_2 {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        System.out.println("Nota del 1 al 100?");
        int nota = in.nextInt();
        
        if (nota >= 0 && nota <= 59)
            System.out.println("Puntuacion: E");
        else if (nota >= 60 && nota <= 69)
            System.out.println("Puntuacion: D");
        else if (nota >= 70 && nota <= 79)
            System.out.println("Puntuacion: C");
        else if (nota >= 80 && nota <= 89)
            System.out.println("Puntuacion: B");
        else if (nota >= 90 && nota <= 100)
            System.out.println("Puntuacion: A");
    }

}