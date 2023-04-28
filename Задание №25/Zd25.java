
import java.util.Scanner;

public class Zd25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ряда M: ");
        int x = scanner.nextInt();
        System.out.print("Введите число ряда N: ");
        int y = scanner.nextInt();
        System.out.print("Количество делителей: ");
        int num1 = scanner.nextInt();

        int[] divisors = new int[num1];
        System.out.println("Введите делители: ");
        for (int i = 0; i < num1; i++) {
            divisors[i] = scanner.nextInt();
        }

        int sum = 0;
        boolean isDivisibleByAll ;
        for (int i = x; i <= y; i++) {
            isDivisibleByAll = true;
            for (int divisor : divisors) {
                if (i % divisor != 0) {
                    isDivisibleByAll = false;
                    break;
                }
            }
            if (isDivisibleByAll) {
                sum += i;
            }
        }

        System.out.println("Сумма чисел, делящихся на все делители: " + sum);
    }
}