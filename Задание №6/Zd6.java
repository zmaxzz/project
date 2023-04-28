public class Zd6 {
    public static void main(String[] args) {
        boolean count = number(101);
        System.out.println(count);
    }
    public static boolean number(int n) {
        int i ;
        for (i = 2; n%i!=0; i++){
        }

        if (i == n) {
            return true;
        }
        return false;
    }
}