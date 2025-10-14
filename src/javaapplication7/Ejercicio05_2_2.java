package javaapplication7;

import java.util.Scanner;

public class Ejercicio05_2_2 {

    public static void main(String[] args) {
       int precio = 2;
       
       Scanner in = new Scanner(System.in);
       System.out.println("Cuantos ariculos compro?");
       int articulo = in.nextInt();
       double precioDescuento = precio * articulo;
       
       if (articulo < 10 && articulo > 0)
            System.out.println("No tienes descuento: " + precioDescuento + "€");
       else if (articulo <=24 && articulo >= 10)
            System.out.println("Tienes un descuento del 10%: " + (precioDescuento * 0.9) + "€");
       else if (articulo <= 100)
            System.out.println("Tienes un descuento del 20% " + (precioDescuento * 0.8) + "€");
       else
            System.out.println("Tienes un descuento del 40% " + (precioDescuento * 0.6) + "€");
    }

}