package javaapplication7;


import java.util.Scanner;


public class Ejercicio13_2_2 {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        System.out.println("Pon el numero de kilometros recorridos");
        int km = in.nextInt();
        
        if (km <= 300)
            System.out.println("Se le cobrara 30€");
        else if (km > 300 && km <= 1000)
            System.out.println("Se le cobrara " + (30 + (km * 0.2)) + "€");
        else if (km > 1000)
            System.out.println("Se le cobrara " + (30 + (700 * 0.2) + ((km - 1000) *0.15)));
        
    }

}