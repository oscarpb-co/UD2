package javaapplication7;

public class Ejercicio09_2_3b {

    public static void main(String[] args) {
        System.out.println("Todos los factoriales de los 20 primeros numeros naturales");

        long mult = 1;

        for (int n = 1; n <= 20; n++) {
            mult *= n;
        
        System.out.println("!" + n + " = " + mult);
        }

        System.out.println("Todos los factoriales de los 20 primeros numeros naturales de nuevo");
         for (int n = 1; n <= 20; n++) {
            mult = 1;
            
            for (int i=n; i > 1; i--)
                mult *= i;
        System.out.println("!" + n + " = " + mult);    
         }
    }

}
