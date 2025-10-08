package javaapplication7;

import java.util.Scanner;

public class Ejercicio02_2_2 {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        int nota = in.nextInt();
        
        if (nota >= 0 && nota <= 10)
            if (nota < 5)
                System.out.println("Suspenso");
            else
                System.out.println("Aprobado");
        else
            System.out.println("Nota incorrecta");
        
        
        
    }

}