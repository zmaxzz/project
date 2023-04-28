import java.util.ArrayList;
import java.util.Scanner;

public class Zd28 {
    private static final ArrayList<Integer> allSquares = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру");
        double simbol = scanner.nextInt();
        if (simbol < 0 || simbol > 10000) {
            System.out.println("Ошибка ввода");
        } else {
            for (int i = 1; i < simbol; i++) {
                allSquares.add((int) Math.pow(i, 2));
            }
        }
        System.out.println(result(simbol));
    }

    public static String result(double userDits) {
        for (int i = 0; i < allSquares.size(); i++) {
            for (int j = 0; j < allSquares.size(); j++) {
                if (allSquares.get(i) - allSquares.get(j) == userDits) {
                    return ((int) userDits + " = " + allSquares.get(i) + " - " + allSquares.get(j));
                }
            }
        }
        return ("Значений не нашлось");
    }
}
