package javaapplication7;

import java.util.Scanner;

public class Ejercicio03_2_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num == 0) {
            System.out.println("Es igual a cero");
        } else if (num % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }

}
