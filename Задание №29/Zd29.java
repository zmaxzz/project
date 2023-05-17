import java.util.Scanner;

public class Zd29 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String num1 = scan.nextLine();
        int x = Integer.parseInt(num1.trim());
        int y = scan.nextInt() - 1;
        int z = 0;
        String[] nums = num1.split("");
        for(int i = 0; i < nums.length; i++){
            y++;
            int n = Integer.parseInt(nums[i].trim ());
            z += Math.pow(n,y);
        }
        if(z % x == 0){

            System.out.println(true);

        } else {
            System.out.println(false);

        }
    }
}