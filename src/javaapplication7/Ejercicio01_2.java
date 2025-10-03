package javaapplication7;

public class Ejercicio01_2 {

    public static void main(String[] args) {
        //a)
        System.out.println((true && true) || false == true);
        //b)
        System.out.println((false || false) && false == true);
        //c)
        System.out.println((!(true && false)) == false);
        //d)
        int i = 1, j = 0, k = -1;
        System.out.println(i + k <= j - k * 3 && k > 2);
        //e)
        int n = 3, m = 2, o = -1;
        System.out.println(n == 3 || m <= 2 && o > 0);
        //f)
        int p = 1;
        System.out.println(3 == 2 || 5 > p + p);
        //g)
        double x = 1, y = 4, z = 10, PI = 3.1416;
        System.out.println("1. " + (PI * x * x > y || 2 * PI * x <= z));
        System.out.println("2. " + (x > 3 && (y == 4 || x + y <= z)));
    }

}
