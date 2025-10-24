package javaapplication7;

import java.util.Scanner;

public class Ejercicio04_2_3 {

    public static void main(String[] args) {
        System.out.println("Dime un numero");
        Scanner primero = new Scanner(System.in);
        int x = primero.nextInt();
        
        System.out.println("Dime otro numero");
        Scanner segundo = new Scanner(System.in);
        int y = segundo.nextInt();
        int suma = 0;
        if ( x > y ) {
            int temporal = x;
            x = y;
            y = x;
        }
        
        if (x % 2 != 0)
            x++;
        
        for (int i = x; i <= y; i+= 2) {
            suma += i;
        }
        System.out.println(suma);
    }

}
