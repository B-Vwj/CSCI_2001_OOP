import java.util.Scanner;

public class DateTest {

    public static void main(String[] args) {

        int user_month;
        String user_month_string;
        int user_day;
        int user_year;

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter a year... ");
        user_year = sc.nextInt();

        System.out.println();
        System.out.println("Enter a day... ");
        user_day = sc.nextInt();

        System.out.println();
        System.out.println("Enter a month... ");
        try {
            user_month = sc.nextInt();
            Date d = new Date(user_month, user_day, user_year);
            System.out.println();
            d.displayDate("MM_DD_YYYY");
            d.displayDate("MONTH_DD_YYYY");
            d.displayDate("DDD_YYYY");
        } catch (Exception e) {
            user_month_string = sc.nextLine();
            Date d = new Date(user_month_string, user_day, user_year);
            System.out.println();
            d.displayDate("MM_DD_YYYY");
            d.displayDate("MONTH_DD_YYYY");
            d.displayDate("DDD_YYYY");
        }

    }

}