package javaapplication7;

import java.util.Scanner;

public class Ejercicio10_2_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pon el año en numero: ");
        int ano = in.nextInt();
        
        int a = ano % 19;
        int b = ano % 4;
        int c = ano % 7;
        int d = (19 * a + 24) % 30;
        int e = (2 * b + 4 * c + 6 * d + 5) % 7;
        int f = (22 + d + e);
        
        if (f <=31)
            System.out.println("Este es el dia de pascua de ese año 03/" + f);
        else
            System.out.println("Este es el dia de pascua de ese año 04/" + (f - 31));
    }

}
