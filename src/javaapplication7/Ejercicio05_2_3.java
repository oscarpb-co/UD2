package javaapplication7;

import java.util.Scanner;

public class Ejercicio05_2_3 {

    public static void main(String[] args) {
        System.out.println("De cantos numeros es el sumatorio");
        Scanner num = new Scanner(System.in);
        int k = num.nextInt();
        double i = 1;
        double div = 0;
        double suma = 0;
        
        for (double n = 1; n <= k; n++) {
            div = i / n;
            suma += div;
        }
        
        System.out.println("El sumatorio es igual a: " + suma);
    }

}
