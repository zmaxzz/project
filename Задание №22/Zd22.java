import java.util.Scanner;
import java.lang.Math;
public class Zd22 {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Пожалуйста, введите три длины сторон треугольника \"+\".");

        System.out.print("a= ");
        int a = scan.nextInt();
        System.out.print("b= ");
        int b = scan.nextInt();
        System.out.print("c= ");
        int c  = scan.nextInt();
        int p1 = ((a+b+c)/2);
        double s = Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));
        System.out.println("Area:"+s);
    }
}