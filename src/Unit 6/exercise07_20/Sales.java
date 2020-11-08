import java.util.*;

public class Sales {

    private int user_id;
    private int product_id;
    private int amount_sold;
    private int[][] sales;
//    private java.util.ArrayList<int> list;
    private int col_sum;

    private int item_one_sold = 0;
    private int item_two_sold = 0;
    private int item_three_sold = 0;
    private int item_four_sold = 0;

    // Constructor

    public Sales() {
        // Instantiate a new Array called... sales
        sales = new int[4][5];

        user_id = -1;
        product_id = -1;
        amount_sold = 0;
    }

    // Sales array

    public int[][] getSales() {
        return sales;
    }

    // User ID

    public void setUserId(int UserId) {
        this.user_id = UserId;
    }

    public int getUserId() {
        return user_id;
    }

    // Product ID

    public void setProductId(int ProductId) {
        this.product_id = ProductId;
    }

    public int getProductId() {
        return product_id;
    }

    // Quantity Sold

    public void setAmountSold(int amountSold) {
        this.amount_sold = amountSold;
    }

    public int getAmountSold() {
        return amount_sold;
    }

    // Function to take in user input, product number, and quantity sold,
    // then passes that to an array position, finally, it assigns it using... [i][j] += quantity
    public String setItemQuantitySold(int id, int product_num, int quantity_sold) {
        String response = "Unable to find item, check if your Employee or Product ID is correct and exists!";

        if (id > 3 || id < 0) {
            response = "No Employee was found with this ID.";
        } else if (product_num > 4 || product_num < 0) {
            response = "No Product was found with this ID.";
        } else if (quantity_sold < 0) {
            response = "Invalid quantity amount, cannot be negative.";
        } else {
            response = "Information has been recorded! Thank you for your cooperation.";
            sales[id][product_num] += quantity_sold;
        }

        return response;
    }

    // Create function to GET quantity sold
    public int getItemQuantitySold(int id, int product_num) {
        try {
            return sales[id][product_num];
        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e);
            return -1;
        }
    }

    public void addToColumnSum(int user_id, int quantity_amount) {
        switch (user_id) {
            case 0:
                item_one_sold = item_one_sold + quantity_amount;
                list[0] += item_one_sold;
                break;
            case 1:
                item_two_sold = item_two_sold + quantity_amount;
                list[1] += item_two_sold;
                break;
            case 2:
                item_three_sold = item_three_sold + quantity_amount;
                list[2] += item_three_sold;
                break;
            case 3:
                item_four_sold = item_four_sold + quantity_amount;
                list[3] += item_four_sold;
                break;
        }
    }

    public ArrayList<int> getList() {
        return list;
    }

}