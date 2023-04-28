public class Zd20 {
    public static void main(String[] args) {
        int[][] array1 = units(5, 5);
        print(array1);
    }

    public static int[][] units(int m, int h){
        int[][] matrix = new int[m][h];
        int x = 2;
        int y = 1, l = 1;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[0][j] = 1;
                matrix[matrix.length - 1][j] = 1;
                matrix[i][0] = 1;
                matrix[i][matrix[i].length - 1] = 1;
            }
        }
        while (y < m && l < h) {

            for (int i = l; i < h - 1; i++) {
                matrix[y][i] = x++;
            }
            y++;

            for (int i = y; i < m - 1; i++) {
                matrix[i][h - 2] = x++;
            }
            h--;

            if (y < m - 1) {
                for (int i = h - 2; i >= l; i--) {
                    matrix[m - 2][i] = x++;
                }
                m--;
            }

            if (l < h - 1) {
                for (int i = m - 2; i >= y; i--) {
                    matrix[i][l] = x++;
                }
                l++;
            }
        }
        return matrix;

    }
    public static void print(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d\t", array[i][j]);
            }
            System.out.println();
        }


    }

}