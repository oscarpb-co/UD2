package javaapplication7;

import java.util.Scanner;

public class Ejercicio06_2_3 {

    public static void main(String[] args) {
        System.out.println("De cantos numeros es el sumatorio");
        Scanner num = new Scanner(System.in);

        int k = num.nextInt();
        double i = 0;
        double j = 2;

        double div = 0;
        double suma = 0;

        for (double n = 1; n < k; n++) {
            i += 5;
            j *= 3;
            div = i / j;
            suma += div;
        }

        System.out.println("El resultado del sumatorio es: " + suma);
    }

}
