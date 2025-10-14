package javaapplication7;

import java.util.Scanner;

public class Ejercicio08_2_2 {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        System.out.println("Pon los numeros separados por espacios");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        
        int num = (a * 1000) + (b * 100) + (c * 10) + d;
        System.out.println("Este es el numero: " + num);
        
        if (c >= 5)
            System.out.println("El numero redondeado es: " + (num - (num % 100)+ 100));
        else
            System.out.println("El numero redondeado es: " + (num - (num %100)));
    }

}