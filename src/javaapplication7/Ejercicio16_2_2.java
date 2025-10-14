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
        double x = 1;

        double parteReal = -b / (2 * a);
        double imaginarioPos = +Math.sqrt(-d) / (2 * a);
        double imaginarioNeg = -Math.sqrt(-d) / (2 * a);

        double solucion = b * x + c;

        if (a == 0) {
            System.out.println("Solo hay una solucion");
            System.out.println(solucion);
        } 
         else if (d < 0) {
                System.out.println("X es: " + (parteReal + imaginarioPos));
        } 
        else {
            System.out.println("X es: " + (parteReal + imaginarioPos));
            System.out.println("X es tambien: " + (parteReal + imaginarioNeg));
        }        
                
                
                
                
                
                
                
                
        
    }

}
