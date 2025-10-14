package javaapplication7;

import java.util.Scanner;

public class Ejercicio07_2_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ponga una hora y unos minutos (en formato 24h) con un espacio entre ellos:");
        int hora = in.nextInt();
        int min = in.nextInt();

        if (hora <= 12) {
            System.out.printf("%02d:%02d", hora, min);
            System.out.println("AM");
        } else if (hora > 12 && hora < 24) {
            System.out.printf("%02d:%02d", (hora - 12), min);
            System.out.println("PM");
        }
        else if (hora == 24) {
            System.out.printf("%02d:%02d", (hora - 24), min);
            System.out.println("AM");
        }    
    }

}
