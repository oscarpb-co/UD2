package javaapplication7;

import java.util.Scanner;

public class Ejercicio09_2_3a {

    public static void main(String[] args) {
        System.out.println("De cantos numeros es el sumatorio");
        Scanner num = new Scanner(System.in);
        int k = num.nextInt();

        double mult = 1;

        if (k == 0 || k == 1) {
            System.out.println("El resultado del factorial es: 1");
        } else {
            for (double n = 2; n <= k; n++) {

                mult *= n;
                

            }
            System.out.println("El resultado del factorial es: " + mult);
        }

    }

}
