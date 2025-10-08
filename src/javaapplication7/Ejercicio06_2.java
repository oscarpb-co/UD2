package javaapplication7;

public class Ejercicio06_2 {

    public static void main(String[] args) {
        //a)
        /*
        int pN = 7;
        int sN = 4;
        int tN = 6;
        double media = (pN + sN + tN) / 3;
        boolean aprueba = media >= 5;
         */
        //b)
        /*
        int NotaMin = 4.5;
        int pN = 7;
        int sN = 4;
        int tN = 6;
        double media = (pN + sN + tN) / 3;
        boolean ConMin = pN >= NotaMin && sN >= NotaMin && tN >= NotaMin;
        boolean aprueba = media && ConMin;
         */
        //c)
        /*
        final int NotaMin = 4.5;
        int pN = 7;
        int sN = 4;
        int tN = 6;
        double media = (pN + sN + tN) / 3;
        boolean practicas = ture;
        boolean ConMin = pN >= NotaMin && sN >= NotaMin && tN >= NotaMin;
        boolean aprueba = media >= 4.5 && ConMin && practicas;*/
        //d)
       
        final double notaMin = 4.5;
        final double notaMinPract = 4.5;
        int pN = 7;
        int sN = 4;
        int tN = 6;
        double media = (pN + sN + tN) / 3;
        int practicas = 4;
        boolean ConMin = pN >= notaMin && sN >=
            notaMin && tN >= notaMin;
        boolean aprueba = media >= 4.5 && 
            ConMin && practicas >= notaMinPract;
        
         double notaFinal = media *0.8 + practicas * 0.2;
        System.out.println("Nota media: " + media);
        System.out.println("Nota final: " + notaFinal);
        System.out.println("Aprueba? " + aprueba); 
        }
        
    }


