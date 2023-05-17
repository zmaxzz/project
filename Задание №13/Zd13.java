public class Zd13 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите начальное число");
        int x = scanner1.nextInt();
        System.out.println("Введите шаг");
        int y = scanner1.nextInt();
        System.out.println("Введите конечное число");
        int z = scanner1.nextInt();
        String result = "";
        for (int i = x; i <= z * y ; i += y) {
            result += i + " ";
        }
        System.out.println(result);
    }
}
