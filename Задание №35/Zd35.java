
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zd35 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Zd352 obj = new Zd352();
        String text_file = "";
        System.out.println("Введите шаг:");
        int step = scanner.nextInt();
        File file = new File("\\Users\\user\\Desktop\\Maxim.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            text_file += scan.nextLine();
        }
        String codeMessage = obj.caesar(text_file, step);
        System.out.print("Зашифрованный текст: " + obj.caesar(text_file, step) + "\n");
        System.out.print("Расшифрованный текст: " + obj.caesar(codeMessage, -step));
    }

}
