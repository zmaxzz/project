import java.util.Scanner;

public class Zd9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        String y = scanner.nextLine();
        boolean z = x.endsWith(y);
        System.out.println(z);
    }
}