import java.util.Scanner;

public class Zd32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        game(num);
    }
    public static void game(long x) {
        int Tanya = 0;
        while (x != 1) {
            if (x % 2 == 0) {
                Tanya++;
                x--;
                if (x == 1) {
                    break;
                } else {
                    x--;
                }

            } else {
                Tanya++;
                x--;
                if (x % 2 == 0) {
                    x /= 2;
                    if (x == 1) {
                        break;
                    }

                }
            }

        }
        System.out.println(Tanya);
    }
}