package javaapplication7;

import java.util.Scanner;

public class Ejercicio18_2_2 {

    public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);
        System.out.println("Dime el valor de x");
        double x = in.nextDouble();

        Scanner inn = new Scanner(System.in);
        System.out.println("Dime el valor de n");
        double n = inn.nextDouble();
        double calculoa = x + (Math.pow(x ,n) / n) - (Math.pow(x ,(n + 2))/(n + 2));
        double calculob = (Math.pow(x, (x + 1)) / (n + 1)) - (Math.pow(x, (n - 1)) / (n - 1));
        if (x >= 0)
            System.out.println(calculoa);
        if (x < 0)
            System.out.println(calculob);
        
        
        
        
        
        
        
        
        
        
        
    }

}