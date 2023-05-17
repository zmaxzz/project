import java.util.Scanner;

public class Zd36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] x = new int[4];
        for(int i = 0; i < 4; ++i) {
            x[i] = (int) (Math.random() * 10);
        }
        for(int j = 0; j < 20; j++) {
            int[] y = new int[4];
            int z = 0;
            for(int i = 0; i < 4; ++i) {
                y[i] = scanner.nextInt();
                if (y[i] == x[i]) {
                    z++;
                }
            }
            if(z == 4) {
                System.out.print("Победа");
                return;
            }
            System.out.print("Совпадений: " + z);
        }
    }

}
