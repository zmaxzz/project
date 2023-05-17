import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zd38 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("\\Users\\user\\Desktop\\Max.txt");
        Scanner sc = new Scanner(file);
        String text_file = "";
        while (sc.hasNextLine()) {
            text_file += sc.nextLine();
        }
        String[] x = text_file.split(" ");
        String[] y;
        for(int i = 0; i < x.length; i++){

            y = x[i].split("");
            x[i] += (y[0] + "ауч");
            x[i] = x[i].substring(1);
        }
        for (String j: x){
            System.out.print(j + " ");
        }
    }
}