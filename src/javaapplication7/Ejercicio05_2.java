package javaapplication7;

import java.util.Scanner;

public class Ejercicio05_2 {

    public static void main(String[] args) {

        Scanner x1 = new Scanner(System.in);
        final int M = 10;
        int n;

        System.out.println("Opcion del menu (1 ," + M + "): ");
        n = x1.nextInt();

        if (n >= 1 && n <= M) {
            System.out.println("Opcion valida.");
        } else {
            System.out.println("Opcion no valida.");
        }

    }

}
