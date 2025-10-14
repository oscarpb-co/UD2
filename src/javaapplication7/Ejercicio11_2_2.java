package javaapplication7;

import java.util.Scanner;

public class Ejercicio11_2_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pon el año en numero: ");
        int ano = in.nextInt();

        int division1 = ano % 4;
        int division2 = ano % 100;
        int division3 = ano % 400;

        if (division1 == 0 && !(division2 == 0)) {
            System.out.println("El año " + ano + " es bisiesto");
        } else if (division2 == 0 && division3 == 0) {
            System.out.println("El año " + ano + " es bisiesto");
        } else {
            System.out.println("El año " + ano + " no es bisiesto");
        }
    }

}
