import java.util.LinkedHashSet;
public class Zd15 {
    public static void main(String[] args){

        String string = line("abc abc ab abc ab acs acs");
        System.out.println(string);
    }
    public static String line(String x){
        String y="";
        String[] arr=x.split(" ");

        LinkedHashSet<String> spisok = new LinkedHashSet();
        for (int i = 0; i < arr.length; i++) {
            spisok.add(arr[i]);
        }
        for(String s:spisok){
            y=y+s+" ";
        }
        return y;
    }
}
