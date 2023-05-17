import java.util.ArrayList;
import java.util.Scanner;

public class Zd37 {
    private static final ArrayList<Integer> num_players = new ArrayList<>();
    private static final ArrayList<Integer> retired = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x;
        System.out.println("Кол-во игроков: " + n +"\n" + "Номер игрока: "
                + (x = scanner.nextInt() - 1 ));
        for (int i = 1; i <= n; i++) {
            num_players.add(i);
        }
        for(int j = 1; j < num_players.size() + 1; j++) {
            x = element_index(x);
        }
        System.out.println(retired.toString());

    }
    public static int element_index(int delete_i) {
        if (delete_i >= num_players.size()) {
            while (delete_i >=  num_players.size()) {
                delete_i -= num_players.size();
            }
        }
        retired.add(num_players.get(delete_i));
        num_players.remove(delete_i);
        return delete_i + 2;
    }

}
