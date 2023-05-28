import java.util.*;
public class Zd48 {
    public static void main(String[] args) {
        int x = 20;
        int y;
        int z;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 1; set.size() < x; i++) {
            y = 2 * i + 1;
            z = 3 * i + 1;
            set.add(i);
            set.add(y);
            set.add(z);
        }
        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);
    }
}