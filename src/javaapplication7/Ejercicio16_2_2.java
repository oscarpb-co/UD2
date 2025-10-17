package javaapplication7;

import java.util.Scanner;

public class Ejercicio16_2_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Dime el valor de a");
        int a = in.nextInt();

        Scanner inn = new Scanner(System.in);
        System.out.println("Dime el valor de b");
        int b = inn.nextInt();

        Scanner innn = new Scanner(System.in);
        System.out.println("Dime el valor de c");
        int c = innn.nextInt();

        double d = Math.pow(b, 2) - (4 * a * c);

        double imaginarioPos = (-b + Math.sqrt(d)) / (2 * a);
        double imaginarioNeg = (-b - Math.sqrt(d)) / (2 * a);

        double x = -c / b;

        double parteReal = -b / (2 * a);
        double parteImaginaria = Math.sqrt(-d) / (2 * a);

        if (a == 0) {
            System.out.println("X es: " + x);

        } else if (d < 0) {
            System.out.println("X es:" + parteReal + " + " + parteImaginaria + "i");
            System.out.println("X es tambien: " + parteReal + " - "
                    + parteImaginaria + "i");
        } else {
            System.out.println("X es: " + imaginarioPos);
            System.out.println("X es tambien: " + imaginarioNeg);
        }

    }

}
