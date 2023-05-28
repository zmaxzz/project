import java.util.Scanner;

public class Zd39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(maxNum(x) > x){
            System.out.println(maxNum(x));
        } else {
            System.out.println(-1);
        }
    }
    public static int maxNum(int num){
        int[] y = new int[10];
        String str = Integer.toString(num);
        for(int i= 0; i < str.length();i++){
            y[str.charAt(i)-'0']++;

        }
        int max = 0;
        int composition = 1;
        for (int i = 0; i < 10; i++){
            while (y[i] > 0) {
                max = max + (i * composition);
                y[i]--;
                composition = composition * 10;
            }

        }
        return max;
    }

}