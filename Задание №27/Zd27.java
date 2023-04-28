import java.util.Scanner;

public class Zd27 {
    private static final String alphabet = "абвгдеёжзийклмнопрстуфхцчшщьыъэюя";
    private static char symbol_shift(char symbol, int shift){
        if (alphabet.indexOf(symbol) != -1){
            return alphabet.charAt((alphabet.indexOf(symbol)+shift) % alphabet.length());
        }
        else {
            return symbol;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scan.nextLine();
        for(int i=1;i<2;i++){
            System.out.println("Зашифрованный текст:");
            for(int j=0;j<text.length();j++){
                System.out.print(symbol_shift(text.charAt(j),i));

            }
            System.out.println();
            System.out.println("Число сдвига:" + i);

        }



    }
}