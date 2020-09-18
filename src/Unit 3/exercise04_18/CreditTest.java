public class CreditTest {

    public static void main (String[] args) {

//        3 Different Complete Sets of Data

        Credit c1 = new Credit(1, 250, 125, 175, 1000); // 200
        Credit c2 = new Credit(2, 410, 50, 460, 1000); // 0
        Credit c3 = new Credit(3, 750, 450, 50, 1000); // 1150

//        Intro Text
        System.out.println("Evaluating Credit Limit:");
        System.out.println("-----");

//        Credit 1 (No overuse)
        System.out.println("Credit for Customer with Account #" + c1.getAccount_num() + ":");
        System.out.println("");

        if (c1.exceededCreditLimit(c1.getNew_balance(), c1.getCredit_limit())) {
            System.out.println("Credit limit exceeded!");
        } else if (c1.reachedCreditLimit(c1.getNew_balance(), c1.getCredit_limit())) {
            System.out.println("Credit limit reached. Pay it off soon!");
        } else {
            System.out.println("You haven't exceeded your Credit limit.");
        }

        System.out.println("-----");
        System.out.println("");

//        Credit 2 (No overuse)
        System.out.println("Credit for Customer with Account #" + c2.getAccount_num() + ":");
        System.out.println("");

        if (c2.exceededCreditLimit(c2.getNew_balance(), c2.getCredit_limit())) {
            System.out.println("Credit limit exceeded!");
        } else if (c2.reachedCreditLimit(c2.getNew_balance(), c2.getCredit_limit())) {
            System.out.println("Credit limit reached. Pay it off soon!");
        } else {
            System.out.println("You haven't exceeded your Credit limit.");
        }

        System.out.println("-----");
        System.out.println("");

//        Credit 3 (Credit limit exceeded)
        System.out.println("Credit for Customer with Account #" + c3.getAccount_num() + ":");
        System.out.println("");

        if (c3.exceededCreditLimit(c3.getNew_balance(), c3.getCredit_limit())) {
            System.out.println("Credit limit exceeded!");
        } else if (c3.reachedCreditLimit(c3.getNew_balance(), c3.getCredit_limit())) {
            System.out.println("Credit limit reached. Pay it off soon!");
        } else {
            System.out.println("You haven't exceeded your Credit limit.");
        }

        System.out.println("-----");

//        Changing Balance (Credit 1: Credit limit reached)
        c1.calculateNewBalance(200, 800, 0); // 1000

        System.out.println("");
        System.out.println("Customer with Account #" + c1.getAccount_num() + "'s new credit limit status: ");

        if (c1.exceededCreditLimit(c1.getNew_balance(), c1.getCredit_limit())) {
            System.out.println("Credit limit exceeded!");
        } else if (c1.reachedCreditLimit(c1.getNew_balance(), c1.getCredit_limit())) {
            System.out.println("Credit limit reached. Pay it off soon!");
        } else {
            System.out.println("You haven't exceeded your Credit limit.");
        }

    }

}