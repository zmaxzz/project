public class Zd4 {
    public static void main(String[] args){
        int x = str_count("Hello", 'o');
        int y = str_count("Hello", 'l');
        int z = str_count("", 'z');
        System.out.println(x + "\n" + y + "\n" + z);
    }
    public static int str_count(String str, char letter){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char n = str.charAt(i);
            if(n == letter) {
                count++;
            }
        }
        return count;
    }


}