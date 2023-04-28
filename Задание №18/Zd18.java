import java.util.Arrays;
public class Zd18 {
    public static void main(String[] args) {
        int[] intArray = new int[]{24, 2, 1, 34, 12, 11, 2};
        int[] array1 = Array1(intArray);
        int[] array2 = Array2(intArray);
        System.out.println(Arrays.toString(array1) + "\n" + Arrays.toString(array2));
    }
    public static int[] Array1(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] == Arrays.stream(array).max().getAsInt()){
                array = Arrays.copyOf(array,i);
            }
        }
        return array;
    }
    public static int[] Array2(int[] a) {
        int x = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == Arrays.stream(a).max().getAsInt()) {
                x = i;
            }
        }
        int[] t = Arrays.copyOfRange(a, x + 1, a.length);
        return t;
    }
}