import java.util.Scanner;

public class DateTest {

    public static void main(String[] args) {

        int user_month;
        int user_day;
        int user_year;
        int date_format;
        String user_month_string;

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("What format do you want the date to be printed out as (1, 2, or 3)? ");
        System.out.println("You have three choices... ");
        System.out.println("1: MM_DD_YYYY");
        System.out.println("2: MONTH_DD_YYYY");
        System.out.println("3: DDD_YYYY");
        date_format = Integer.parseInt(sc.nextLine());

        System.out.println();
        System.out.println("Enter a year... ");
        user_year = Integer.parseInt(sc.nextLine());

        switch(date_format) {
            case 1:
                System.out.println();
                System.out.println("Enter a day... ");
                user_day = sc.nextInt();

                System.out.println();
                System.out.println("Enter a month (Int type)... ");
                user_month = sc.nextInt();
                Date d = new Date(user_month, user_day, user_year);
                System.out.println();
                d.displayDate("MM_DD_YYYY");
                d.displayDate("MONTH_DD_YYYY");
                d.displayDate("DDD_YYYY");
                break;
            case 2:
                System.out.println();
                System.out.println("Enter a day... ");
                user_day = Integer.parseInt(sc.nextLine());

                System.out.println();
                System.out.println("Enter a month (String type i.e. 'December')... ");
                user_month_string = sc.nextLine();

                d = new Date(user_month_string, user_day, user_year);
                System.out.println();
                d.displayDate("MM_DD_YYYY");
                d.displayDate("MONTH_DD_YYYY");
                d.displayDate("DDD_YYYY");
                break;
            case 3:
                System.out.println();
                System.out.println("Enter a day (Julian day 1 - 365 (366 if it's a leap year))... ");
                user_day = Integer.parseInt(sc.nextLine());

                d = new Date(user_day, user_year);
                System.out.println();
                d.displayDate("MM_DD_YYYY");
                d.displayDate("MONTH_DD_YYYY");
                d.displayDate("DDD_YYYY");
                break;
        }

    }

}