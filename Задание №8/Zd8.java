import java.util.Arrays;
import java.util.Scanner;

public class Zd8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[] triangle = new double[3];
        for (int i = 0; i < 3;i++){
            triangle[i] = scanner.nextInt();
            if (triangle[0] + triangle[1] > triangle[2] &
                    triangle[1] + triangle[2] > triangle[0] &
                    triangle[0] + triangle[2] > triangle[1]){
                double x = (triangle[0]*triangle[0] + triangle[1]*triangle[1]
                        - triangle[2]*triangle[2])/(2*triangle[0]*triangle[1]);
                double y = (triangle[1]*triangle[1] + triangle[2]*triangle[2]
                        - triangle[0]*triangle[0])/(2*triangle[1]*triangle[2]);
                double z = (triangle[0]*triangle[0] + triangle[2]*triangle[2]
                        - triangle[1]*triangle[1])/(2*triangle[0]*triangle[2]);
                double[] integers = new double[] {x,y,z};
                double max = Arrays.stream(integers).max().getAsDouble();
                double degrees = Math.acos(max);
                System.out.println(180 - degrees*180.0d/Math.PI);
            }
        }

    }

}