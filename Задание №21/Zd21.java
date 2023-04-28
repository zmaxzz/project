import java.util.Scanner;

public class Zd21 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        String y = x.nextLine();
        String[] str = y.split("");
        String str1 = "";
        for(int i = 0; i < str.length; i++){
            int w = Integer.parseInt(str[i]);
            if(str[i].equals("1")||str[i].equals("2")||str[i].equals("3")) {
                w += 6;
                str1 += w;

            }
            if(str[i].equals("4")||str[i].equals("5")||str[i].equals("6")||str[i].equals("0")){
                str1 += w;

            }
            if(str[i].equals("7")||str[i].equals("8")||str[i].equals("9")){
                w -= 6;
                str1 += w;

            }
        }
        System.out.println(str1);


    }

}