import static java.lang.Math.max;
import static java.util.Arrays.fill;

public class Zd43 {
    public static void main(String[] args) {
        int[] piramida =
                {5,
                        9, 0,
                        3, 6, 7,
                        2, 9, 8, 1,
                        323,984,1,111,1
                };

        System.out.println("Max. summ.: " + findingMaxSumm(piramida, 5));
    }

    public static int findingMaxSumm(int[] tree, int num1) {
        int[] summ1 = new int[num1 + 1];
        fill(summ1 , 0);
        int element1 = num1;
        int num2 = element1 - 1;
        int[] next_elements = new int[element1];
        for(int i = tree.length - 1; i > -1 ; i--) {
            int left_max_path = summ1[num2];
            int right_max_path = summ1[num2 + 1];
            next_elements[num2] = max(right_max_path, left_max_path) + tree[i];
            num2 -= 1;
            if (num2 == -1) {
                element1--;
                num2 = element1 - 1;
                summ1 = next_elements;
                next_elements = new int[summ1.length - 1];
            }
        }
        return summ1[0];
    }
}
