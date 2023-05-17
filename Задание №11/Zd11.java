public class Zd11 {
    private static final char [] mass = {'а', 'у', 'о' ,'ы','э','я','ю','ё','и','е'};
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите строку");
        String x = scanner1.nextLine();
        String y = "";
        int z = 0;
        char checkLetter;
        for (int i = 0; i < x.length(); i++) {
            z = 0;
            checkLetter = x.charAt(i);
            for (int j = 0; j < mass.length; j++) {
                if (checkLetter == mass[j]) {
                    z++;
                    break;
                }
            }
            if (z == 0) {
                y = y + checkLetter;
            }
        }
        System.out.println(y);
    }
}
