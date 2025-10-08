package javaapplication7;

import java.util.Scanner;

public class Ejercicio01_2_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nota = in.nextInt();
        
        if (nota >= 0 && nota <= 10)
            System.out.println("Nota correcta");
        else
            System.out.println("Nota incorrecta");
    }

}