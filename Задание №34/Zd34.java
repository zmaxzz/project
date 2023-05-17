import java.util.Arrays;

public class Zd34 {
    public static void main(String[] args) {
        String[] spisok1 = {"56", "65", "74", "100", "99", "68", "86", "180", "90"};
        String[] spisok2 = new String[9];
        String[] otvet = new String[9];
        for (int i = 0; i < spisok1.length; i++) {
            String elementOfArrray = spisok1[i];
            String result = "";
            int plus = 0;
            for (int j = 0; j < elementOfArrray.length(); j++) {
                plus += Integer.parseInt(String.valueOf(elementOfArrray.charAt(j)));
            }
            result += plus;
            spisok2[i] = result;
        }
        for (int k = 0; k < 9; k++) { //Заполнение цикла ответ
            int checkForNullInSort = 0;
            if (spisok2[checkForNullInSort] == null) {
                while(spisok2[checkForNullInSort] == null) {
                    if (checkForNullInSort == 8) {
                        break;
                    }else {
                        checkForNullInSort++;
                    }
                }
            }
            int min = Integer.parseInt(spisok2[checkForNullInSort]);
            int indexForOtvet = 0;
            for (int i = 1; i < spisok2.length; i++) {
                if (spisok2[i] != null) {
                    if (Integer.parseInt(spisok2[i]) < min) {
                        min = Integer.parseInt(spisok2[i]);
                        indexForOtvet = i;
                    }
                }
            }
            if (indexForOtvet == 0) {
                spisok2[checkForNullInSort] = null;
                otvet[k] = spisok1[checkForNullInSort];
            } else {
                spisok2[indexForOtvet] = null;
                otvet[k] = spisok1[indexForOtvet];
            }
        }
        System.out.println(Arrays.toString(otvet));
    }
}