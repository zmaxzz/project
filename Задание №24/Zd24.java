import java.util.Scanner;

public class Zd24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ряд M: ");
        int x = scanner.nextInt();
        System.out.print("Введите ряд N: ");
        int z = scanner.nextInt();
        System.out.print("Количество делителей: ");
        int num = scanner.nextInt();

        int[] num1 = new int[num];
        System.out.println("Введите делители: ");
        for (int i = 0; i < num; i++) {
            num1[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = x; i <= z; i++) {
            boolean num3 = false;
            for (int num2 : num1) {
                if (i % num2 == 0) {
                    num3 = true;
                    break;
                }
            }
            if (num3) {
                sum += i;
            }
        }

        System.out.println("Сумма чисел, делящихся на один из делителей: " + sum);
    }
}
