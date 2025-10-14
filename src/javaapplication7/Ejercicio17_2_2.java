package javaapplication7;

import java.util.Scanner;

public class Ejercicio17_2_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime el dia");
        int dia = in.nextInt();

        Scanner inn = new Scanner(System.in);
        System.out.println("Dime el mes");
        int mes = inn.nextInt();

        Scanner innn = new Scanner(System.in);
        System.out.println("Dime el año");
        int ano = innn.nextInt();

        int a = (12 - mes) / 10;
        int b = ano - a;
        int c = mes + (12 * a);
        int d = b / 100;
        int e = d / 4;
        int f = 2 - d + e;
        double g = Math.floor(365.25 * b);
        double h = Math.floor(30.6001 * (c + 1));
        double i = f + g + h + dia + 5;
        int diaDeLaSemana = (int) i % 7;

        switch (diaDeLaSemana) {
            case 0:
                System.out.println("Es sabado");
                break;
            case 1:
                System.out.println("Es domingo");
                break;
            case 2:
                System.out.println("Es lunes");
                break;
            case 3:
                System.out.println("Es martes");
                break;
            case 4:
                System.out.println("Es miercoles");
                break;
            case 5:
                System.out.println("Es jueves");
                break;
            case 6:
                System.out.println("Es viernes");
                break;
            default:
                System.out.println("Algun dia");
                break;

        }

    }

}
