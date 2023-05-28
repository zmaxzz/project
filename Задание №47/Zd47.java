import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Zd47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(Math.round(Math.sqrt(x)) * Math.round(Math.sqrt(x)) == x){
            double size = Math.sqrt(x);
            int size1 = (int) size;
            int[][] array = new int[size1][size1];
            for (int i = 0;i < size1;i++){
                for (int j = 0;j < size1;j++){
                    array[i][j]= (int) (Math.random() * 10);
                }
            }
            System.out.println(Arrays.deepToString(array));
            System.out.println(snail(size1, array));
        }
    }
    public static List<Integer> snail(int size, int[][] array){
        List<Integer> snail_arr = new ArrayList<>();
        int[] snail_arr1 = new int[size*size+3];
        int quantity = 0;
        int y = 0;
        int z = 0;
        int num1 = size;
        int num2 = size;
        while (quantity != size*size)
        {
            for (int j = y;j < num1;j++)
            {
                snail_arr1[quantity] = array[z][j];

                quantity++;
            }
            for (int i = z+1;i < num2;i++)
            {
                snail_arr1[quantity] = array[i][num1-1];
                quantity++;
            }
            num1--;
            for (int j = num1-1;j >= y;j--)
            {
                snail_arr1[quantity] = array[num2-1][j];
                quantity++;
            }
            num2--;
            z++;
            for (int i = num2-1;i >=z;i--)
            {
                snail_arr1[quantity] = array[i][y];
                quantity++;
            }
            y++;
        }

        for (int i = 0;i < quantity;i++){
            snail_arr.add(snail_arr1[i]);
        }
        return snail_arr;

    }


}