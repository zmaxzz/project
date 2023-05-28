import java.util.Scanner;

public class Zd44 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        String y = scanner.nextLine();
        int x_int = Integer.parseInt(x);
        int y_int = Integer.parseInt(y);
        int summ = x_int + y_int;
        String summ_str = "" + summ;
        System.out.println(summ_str);

    }
}