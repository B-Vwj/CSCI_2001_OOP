public class Date {

    private final static String MM_DD_YYYY = "MM_DD_YYYY";
    private final static String MONTH_DD_YYYY = "MONTH_DD_YYYY";
    private final static String DDD_YYYY = "DDD_YYYY";

    private int month;
    private int date;
    private int year;

    private final String[] months = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    public Date (int month, int date, int year) {
        this.month = month;
        this.date = date;
        this.year = year;
//        int[] daysPerMonth = { 0, 31, getFebDays(year), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    }

    public Date (String month, int date, int year) {
        for (int i = 1; i < months.length; i++) {
            if (months[i].equals(month)) {
                this.month = i;
            }
        }
        this.date = date;
        this.year = year;
    }

    // Leap Year Validations

    private boolean validateLeapYear(int year) {
        boolean leap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
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
            System.out.println();
        } else {
            System.out.println();
            System.out.println("No leap year detected.");
            System.out.println();
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

    // TODO: Create a function that takes in an argument and displays the corresponding date format.
    public void displayDate(String format) {
        switch (format) {
            case MM_DD_YYYY:
                System.out.println("MM/DD/YYYY: " + month + "/" + date + "/" + year);
                System.out.println();
                break;
            case MONTH_DD_YYYY:
                System.out.println("MONTH DD, YYYY: " + months[month] + " " + date + ", " + year);
                System.out.println();
                break;
//            case DDD_YYYY:
//                System.out.println("DDD YYYY: " + " " + year);
//                System.out.println();
//                break;
            default:
                break;
        }
    }
}