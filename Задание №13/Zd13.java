import java.util.Scanner;
public class Zd13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int i = 0;
        if(x < y){
            if(y < z){
                while(i < z){
                    System.out.println(x);
                    i++;
                    x += y;

                }
            }

        }

    }
}