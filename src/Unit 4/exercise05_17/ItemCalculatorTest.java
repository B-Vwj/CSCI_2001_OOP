import java.util.*;

public class ItemCalculatorTest {

    public static void main (String[] args) {

        int num_of_items_sold = 0;
        int answer;
        int choice;

        ItemCalculator i = new ItemCalculator();
        Scanner s = new Scanner(System.in);

        System.out.println("Ready to go shopping? 1 for yes or 0 for no. ");
        answer = s.nextInt();

        while (answer == 1) {
            System.out.println("What would you like to look at?");
            System.out.println("Product 1, 2, 3, 4, or 5?");
            System.out.println("Or type 6 to see your shopping cart, and 0 if you want to quit shopping. ");

            int reply = s.nextInt();
            System.out.println("");

            if (reply == 0) {
                System.out.println("");
                break;
            }

            switch (reply) {
                case 1:
                    System.out.println("Product One costs $2.98 per item. Buy? 1 for yes, 0 for no.");
                    choice = s.nextInt();
                    if (choice == 1) {
                        num_of_items_sold++;
                        System.out.println("");
                        System.out.println(i.add_to_cart("product_one"));
                        System.out.println("");
                        break;
                    } else if (choice == 0) {
                        break;
                    } else {
                        System.out.println("Unknown command, try again.");
                        break;
                    }
                case 2:
                    System.out.println("Product Two costs $4.50 per item. Buy? 1 for yes, 0 for no.");
                    choice = s.nextInt();
                    if (choice == 1) {
                        num_of_items_sold++;
                        System.out.println("");
                        System.out.println(i.add_to_cart("product_two"));
                        System.out.println("");
                        break;
                    } else if (choice == 0) {
                        break;
                    } else {
                        System.out.println("Unknown command, try again.");
                        break;
                    }
                case 3:
                    System.out.println("Product Three costs $9.98 per item. Buy? 1 for yes, 0 for no.");
                    choice = s.nextInt();
                    if (choice == 1) {
                        num_of_items_sold++;
                        System.out.println("");
                        System.out.println(i.add_to_cart("product_three"));
                        System.out.println("");
                        break;
                    } else if (choice == 0) {
                        break;
                    } else {
                        System.out.println("Unknown command, try again.");
                        break;
                    }
                case 4:
                    System.out.println("Product Four costs $4.49 per item. Buy? 1 for yes, 0 for no.");
                    choice = s.nextInt();
                    if (choice == 1) {
                        num_of_items_sold++;
                        System.out.println("");
                        System.out.println(i.add_to_cart("product_four"));
                        System.out.println("");
                        break;
                    } else if (choice == 0) {
                        break;
                    } else {
                        System.out.println("Unknown command, try again.");
                        break;
                    }
                case 5:
                    System.out.println("Product Five costs $6.87 per item. Buy? 1 for yes, 0 for no.");
                    choice = s.nextInt();
                    if (choice == 1) {
                        num_of_items_sold++;
                        System.out.println("");
                        System.out.println(i.add_to_cart("product_five"));
                        System.out.println("");
                        break;
                    } else if (choice == 0) {
                        break;
                    } else {
                        System.out.println("Unknown command, try again.");
                        break;
                    }
                case 6:
                    System.out.println("Your grand total will be: $" + i.getTotal_price() + " if you check out now.");
                    System.out.println("You currently have " + num_of_items_sold + " items in your cart.");
                    System.out.println("");
                    break;
                default:
                    System.out.println("");
                    System.out.println("404 (ERROR): Unknown input, try again.");
                    System.out.println("");
                    break;
            }

        }

        System.out.println("Your grand total was: $" + i.getTotal_price());
        System.out.println("You bought " + num_of_items_sold + " items");

    }

}