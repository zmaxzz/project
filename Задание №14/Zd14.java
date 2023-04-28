import java.util.Arrays;
import java.util.Scanner;

public class Zd14 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество ячеек");
        int size = s.nextInt();
        int[][] array = cells(size);
        System.out.println("Ячейки заполнены" + "\n" + Arrays.deepToString(array));
        array1(array);
    }
    public static int[][] cells(int size){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы");
        int[][] array = new int[size][3];
        for(int i = 0; i < array.length;i++){
            for(int j = 0; j < 3;j++){
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }
    public static void array1(int[][] m){
        Scanner s = new Scanner(System.in);
        while(true){
            int number = s.nextInt();
            int x = Integer.MAX_VALUE;
            int y = -1;
            int z = -1;
            for(int i = 0; i < m.length;i++){
                for(int j = 0; j < 3;j++){
                    if(m[i][j] < x){
                        x = m[i][j];
                        y = i;
                        z = j;
                    }
                }
            }
            m[y][z] = number;
            System.out.println(Arrays.deepToString(m));
        }
    }

}
