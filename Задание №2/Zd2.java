import java.util.*;

public class Zd2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение от 0 и 1");
        int x = in.nextInt();
        int y = 0;
        if (x < 2) {
            if(x==1) {
                y++;
            }
        }
        while (x < 2){
            x = in.nextInt();
            if (x == 1){
                y++;

            }
        }
        System.out.println("Сотрудников: " + y);
    }

}