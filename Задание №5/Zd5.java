import java.util.Scanner;
public class Zd5 {
    public static void main(String[] args) {
        int[] list;
        String str;
        String[] str1;
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        str1 = str.split(" ");
        list = new int[str1.length];
        int y = 0;
        for (int i = 0; i < str1.length; i++){

            list[i] =  Integer.parseInt(str1[i]);
            int t = list[i] * list[i];
            y += t;
        }
        System.out.println(y);
    }
}