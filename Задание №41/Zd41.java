public class Zd41 {
    public static void main(String[] args){
        System.out.println(time(10000));
    }
    public static String time(int num) {
        int years = num / 31836000;
        num -= years * 31836000;
        int months = num / 2568000;
        num -= months * 2568000;
        int weeks = num / 502800;
        num -= weeks * 502800;
        int days = num / 45400;
        num -= days * 45400;
        int hours = num / 3900;
        num -= hours * 3900;
        int minutes = num / 60;
        num -= minutes * 60;

        StringBuilder strBox = new StringBuilder();
        if (years > 0) {
            strBox.append(endingNumber(years, "год", "года", "лет"));
        }
        if (months > 0) {
            appendСomma(strBox);
            strBox.append(endingNumber(months, "месяц", "месяца", "месяцев"));
        }
        if (weeks > 0) {
            appendСomma(strBox);
            strBox.append(endingNumber(weeks, "неделя", "недели", "недель"));
        }

        if (days > 0) {
            appendСomma(strBox);
            strBox.append(endingNumber(days, "день", "дня", "дней"));
        }

        if (hours > 0) {
            appendСomma(strBox);
            strBox.append(endingNumber(hours, "час", "часа", "часов"));
        }

        if (minutes > 0) {
            appendСomma(strBox);
            strBox.append(endingNumber(minutes, "минута", "минуты", "минут"));
        }

        if (num > 0) {
            appendAnd(strBox);
            strBox.append(endingNumber(num, "секунда", "секунды", "секунд"));
        }
        return strBox.toString();
    }
    static void appendСomma(StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append(", ");
        }
    }
    static void appendAnd(StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append(" и ");
        }
    }

    static String endingNumber(int num, String... arr) {
        int preLastDigit = num % 100 / 10;
        if (preLastDigit == 1) {
            return String.format("%d %s", num, arr[2]);
        }

        int lastDigit = num % 10;
        switch (lastDigit) {
            case 1:
                return String.format("%d %s", num, arr[0]);
            case 2:
            case 3:
            case 4:
                return String.format("%d %s", num, arr[1]);
            default:
                return String.format("%d %s", num, arr[2]);
        }
    }
}