import java.util.Arrays;
import java.util.Random;

public class Zd42 {
    public static void main(String[] args){
        int x = (int) (Math.random() * 10);
        int[][] arr = new int[x][2];
        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < 2;j++){
                arr[i][j] = (int) (Math.random() * 20);
            }
            Arrays.sort(arr[i]);
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(count(arr));

    }
    public static int count(int[][] arr){
        int difference = 0;
        int summ = 0;
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < 2;j++){
                difference = arr[i][1] - arr[i][0];
            }
            summ += difference;

        }
        return summ;

    }
}