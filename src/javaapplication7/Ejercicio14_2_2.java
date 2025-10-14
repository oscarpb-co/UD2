package javaapplication7;

import java.util.Scanner;

public class Ejercicio14_2_2 {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        System.out.println("Pon el numero de serie de el repuesto de coches");
        int rango = in.nextInt();
        
        if (rango >= 14681 && rango <= 15681)
            System.out.println("Defectuoso");
        else if (rango >= 70001 && rango <= 79999)
            System.out.println("Defectuoso");
        else if (rango >= 88888 && rango <= 111111)
            System.out.println("Defectuoso");
        else
            System.out.println("No defecuoso");
    }

}