package javaapplication7;

import java.util.Scanner;

public class Ejercicio04_2 {

    public static void main(String[] args) {
       
        Scanner x1 = new Scanner(System.in);
        System.out.println("Fila: ");
        int x2 = x1.nextInt();
        
        Scanner y1 = new Scanner(System.in);
        System.out.println("Columna:");
        int y2 = y1.nextInt();
        
        System.out.println("(" + x2 + "," + y2 + ")" +
        " dentro de la matriz?: " + 
        (x2 >= 1 && x2 <= 5 && y2 >= 1 && y2 <= 5)
        );
        
    }

}