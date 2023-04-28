import java.util.Random;
public class Zd1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int x = 4;
        int y = 3;

        int[][] matrix = new int[x][y];

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                matrix[j][i] = rnd.nextInt(10);
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }

}

