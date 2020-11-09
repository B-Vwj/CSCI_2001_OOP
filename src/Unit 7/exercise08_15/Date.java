public class Date {

    private final static String MM_DD_YYYY = "MM_DD_YYYY";
    private final static String MONTH_DD_YYYY = "MONTH_DD_YYYY";
    private final static String DDD_YYYY = "DDD_YYYY";

    private int month;
    private int day;
    private int year;
    private int dayNumber;
    private boolean leap;
    private final String[] months = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    // Constructors

    public Date (int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
        dayNumber = getDayNumber();
    }

    public Date (String month, int day, int year) {
        for (int i = 1; i < months.length; i++) {
            if (months[i].equals(month)) {
                this.month = i;
            }
        }
        this.day = day;
        this.year = year;
        dayNumber = getDayNumber();
    }

    public Date (int dayNumber, int year) {
        this.dayNumber = dayNumber;
        this.year = year;
        int[] daysPerMonth = { 0, 31, getFebDays(year), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        month = 1;

        for (int i = 1; i < daysPerMonth.length; i++) {

            if (dayNumber - daysPerMonth[i] > 0) {
                dayNumber -= daysPerMonth[i];
                month++;
            } else {
                break;
            }

        }
        day = dayNumber;
    }

    // Leap Year Validations

    private boolean validateLeapYear(int year) {
        int test_one = year % 4;
        int test_two = year % 100;
        int test_three = year % 400;

        if (test_one == 0) {
            if (test_two == 0) {
                if (test_three == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
            } else {
                leap = true;
            }
        } else {
            leap = false;
        }

        if (leap) {
            System.out.println();
            System.out.println("Leap year detected!");
        } else {
            System.out.println();
            System.out.println("No leap year detected.");
        }

        return leap; // True or False
    }

    // Days in Feb

    private int getFebDays(int year) {
        if (validateLeapYear(year)) {
            return 29;
        } else {
            return 28;
        }
    }

    private int getDayNumber() {
        int[] daysPerMonth = { 0, 31, getFebDays(year), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        dayNumber = day;

        for (int i = 1; i < daysPerMonth.length; i++) {
            if (i < month) {
                dayNumber += daysPerMonth[i];
            } else {
                break;
            }
        }
        return dayNumber;
    }

    public void displayDate(String format) {
        switch (format) {
            case MM_DD_YYYY:
                System.out.println("MM/DD/YYYY: " + month + "/" + day + "/" + year);
                System.out.println();
                break;
            case MONTH_DD_YYYY:
                System.out.println("MONTH DD, YYYY: " + months[month] + " " + day + ", " + year);
                System.out.println();
                break;
            case DDD_YYYY:
                System.out.println("DDD YYYY: " + dayNumber + " " + year);
                System.out.println();
                break;
            default:
                break;
        }
    }
}