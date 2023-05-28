import java.util.Scanner;

public class Zd45 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println(romanNumeral(num1));
    }
    public static String romanNumeral(int num1) {
        StringBuilder strBox = new StringBuilder();
        if(1 < num1 && num1 < 10000){
            int times;
            String[] num2 = new String[] { "I", "IV", "V", "IX", "X", "XL", "L",
                    "XC", "C", "CD", "D", "CM", "M" };
            int[] num11 = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500,
                    900, 1000 };
            for (int i = num11.length - 1; i >= 0; i--) {
                times = num1 / num11[i];
                num1 %= num11[i];
                while (times > 0) {
                    strBox.append(num2[i]);
                    times--;
                }
            }
            return strBox.toString();
        }
        return "";

    }
}