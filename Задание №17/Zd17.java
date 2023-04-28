import java.util.Stack;


public class Zd17 {

    public static boolean function(String s){
        if (s == null)
            return false;
        int len=s.length();
        int count=0;
        Stack stack = new Stack();
        char ch;
        for (int i=0;i<len;i++){
            ch=s.charAt(i);

            if (ch=='(') {
                stack.push(ch);
                count=count+1;
            }
            else{
                if ((!stack.isEmpty()) && ch==')') {
                    stack.pop();
                    count=count-1;}


            }
        }
        if (stack.isEmpty() && count==0)
            return true;
        else
            return false;

    }

    public static void main(String[] args){

        System.out.println(function("(a((s)))-"));

    }

}