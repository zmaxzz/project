import java.util.Scanner;
public class Zd3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float triangle[][] = new float[3][2];
        int x = 1;
        int y;
        for(y = 0; y<3;y++){
            System.out.println("Введите координату"+x);
            x++;
            for(int j = 0; j < 2; j++) {
                triangle[y][j] = scanner.nextInt();
            }
        }
        System.out.println((triangle[0][0] + triangle[1][0] + triangle[2][0])/3 + ","
                + (triangle[0][1] + triangle[1][1] + triangle[2][1])/3);
    }

}
