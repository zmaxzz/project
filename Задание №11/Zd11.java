import java.util.Scanner;

public class Zd11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        String[] chars = new String[] {"а","е","я","ё","у","и","ю","э","ы","о"};
        for(int i = 0; i < chars.length; i++){
            x = x.replace(chars[i],"");
        }
        System.out.println(x);
    }
}