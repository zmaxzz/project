import java.util.Scanner;

public class Zd10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        String y = x.toLowerCase();
        String z = y.substring(0,1).toUpperCase() + y.substring(1);
        System.out.println("Привет, " + z + "!");
    }
}