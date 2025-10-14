package javaapplication7;

import java.util.Scanner;

public class Ejercicio06_2_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Cuantos hijos/as tiene?");
        int hijos = in.nextInt();

        double salario = 1200;

        if (hijos <= 2) 
            System.out.println("Tu salario es: " + (salario * 0.8) + "€");
         else if (hijos <= 5) 
            System.out.println("Tu salario es: " + (salario * 0.85) + "€");
         else if (hijos <= 7) 
            System.out.println("Tu salario es: " + (salario * 0.9) + "€");
         else if (hijos <= 9) 
            System.out.println("Tu salario es: " + (salario * 0.95) + "€");
         else 
            System.out.println("Tu salario es: " + salario + "€");
        

    }

}
