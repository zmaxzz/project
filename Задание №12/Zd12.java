import java.util.Scanner;
public class Zd12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if(x < y){
            while(x <= y){
                System.out.println(x*x);
                x++;
            }
        }
        if(y < x){
            while(y <= x){
                System.out.println(y*y);
                y++;
            }
        }

    }
}
