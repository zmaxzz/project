import java.util.Scanner;
public class Zd16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        String[] z = x.split("");
        int y = 0;
        for(int i = 0; i <  z.length;i++){
            if(z[i].equals(z[i].toUpperCase())) {
                y++;
            }
            if(y > z.length - y) {
                x = x.toUpperCase();
            } else {
                x = x.toLowerCase();
            }
        }
        System.out.println(x);

    }
}
