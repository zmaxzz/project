import java.util.Scanner;

public class Zd26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String x = scanner.nextLine();
        scanner.close();
        int palindrome = palindrome1(x);
        System.out.println("Длинейший палиндром в строке: " + palindrome);
    }

    public static int palindrome1(String input) {
        int n = input.length();
        boolean[][] dp = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        int palindrome2 = 1;

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;


                if (input.charAt(i) == input.charAt(j) && (len == 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    palindrome2 = len;
                }
            }
        }

        return palindrome2;
    }
}