package javaapplication7;

import java.util.Scanner;

public class Ejercicio09_2_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el numero de mes");
        int mes = in.nextInt();
        
        switch (mes) { 
            case 1, 3, 5 , 7, 8, 10, 12:
                System.out.println("Tiene 31 dias");
            break;
            case 4, 6, 9, 11:
                System.out.println("Tiene 30 dias");
            break;
            case 2:
                System.out.println("Tiene 28 dias");
            break;
            default:
                System.out.println("Numero incorrecto");
            break;    
        }
    }

}
