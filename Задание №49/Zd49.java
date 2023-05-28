public class Zd49 {
    public static void main(String[] args) {
        System.out.println(fusc(0) + "\n" + fusc(1) + "\n"
                + fusc(11)+ "\n" + fusc(3) + "\n" + fusc(9999));
    }
    public static int fusc(int n) {
        int x = 1;
        int y = 2;
        int z;
        if(n == 0) {
            return 0;
        }
        while(n >= 2) {
            if(n % 2 == 0) {
                n /= 2;
            } else {
                z = x;
                x = x + y;
                y = z;
                n--;
            }
        }
        return x + y;

    }
}
