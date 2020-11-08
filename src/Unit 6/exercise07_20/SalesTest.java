import java.util.Scanner;

public class SalesTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sales s = new Sales();

        // Loop vars
        int input;
        int answer;
        int quantity;
        int[] value = s.getList();
        int[][] array = s.getSales();
        int[] col_sum = new int[4];

        // Loop that asks for user input... id, product number... Another Loop will use i and j variables
        // Which is passed into getUserId(i) & getProductId(j) as i and j
        while (true) {
            System.out.println("");
            System.out.println("+++++ Employee Sales Database +++++");

            // Asks user for input
            System.out.println("Enter -1 to exit when asked to input a number.");
            System.out.println("");

            System.out.println("+++++ Employee ID +++++");
            System.out.println("Enter your Employee ID Number (0 - 3): ");
            input = sc.nextInt();
            if (input == -1) {
                System.out.println("");
                System.out.println("ABRUPT STOP!");
                System.out.println("Reason: User Exited...");
                System.out.println("");
                break;
            } else {
                s.setUserId(input);
            }

            System.out.println("");
            System.out.println("+++++ Product ID +++++");
            System.out.println("Enter the Product ID Number (0 - 4): ");
            answer = sc.nextInt();
            if (answer == -1) {
                System.out.println("");
                System.out.println("ABRUPT STOP!");
                System.out.println("Reason: User Exited...");
                System.out.println("");
                break;
            } else {
                s.setProductId(answer);
            }

            System.out.println("");

            if (s.getItemQuantitySold(s.getUserId(), s.getProductId()) == -1) {
                System.out.println("ABRUPT STOP!");
                System.out.println("ERROR: No Employee # can exceed 3");
                System.out.println("ERROR: No Product # can exceed 4");
                System.out.println("");
                break;
            }

            System.out.println("+++++ Amount Sold +++++");
            System.out.println("How many did you sell? ");
            quantity = sc.nextInt();
            if (quantity == -1) {
                System.out.println("");
                System.out.println("ABRUPT STOP!");
                System.out.println("Reason: User Exited...");
                System.out.println("");
                break;
            } else {
                s.setAmountSold(quantity);
            }

            s.addToColumnSum(s.getUserId(), s.getItemQuantitySold(s.getUserId(), s.getProductId()));
            value[s.getUserId()] = s.getList();
            System.out.println("");
            System.out.println(s.setItemQuantitySold(s.getUserId(), s.getProductId(), s.getAmountSold()));
            System.out.println("");

        }

        // Calls function
        // Loop that outputs data onto a table
        for (int i = 0; i < array.length; i++) {
            int row_sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf(array[i][j] + "\t");
                row_sum += array[i][j];

                if (j == 4) {
                    System.out.print("+ " + row_sum);
                }
            }

            if (i == 3) {
                System.out.println();
                System.out.println("+ + + + + + + + + + + + + + + + + + + + +");
                for (int count = 0; count < 4; count++) {
                    int numbers = 0;
//                    System.out.println(col_sum[count]);
//                    System.out.println(value[count]);
                    col_sum[count] = value[count];
                    numbers = numbers + col_sum[count];
//                    for (count = 0; count < 4; count++) {
                    System.out.printf(numbers + "\t");
//                    }
                }
            }
            System.out.println("");
        }

        // Reset User and Product information
        System.out.println("");
        System.out.println("Resetting Input Data...");
        s.setUserId(-1);
        s.setProductId(-1);
        System.out.println("Successfully Reset Input Data!");

        System.out.println("");
        System.out.println("You are now logged out.");
        System.out.println("Restart App to log back in.");

    }

}