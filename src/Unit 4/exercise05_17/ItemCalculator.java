public class ItemCalculator {

//    Product "Names"
    private String product_one;
    private String product_two;
    private String product_three;
    private String product_four;
    private String product_five;

//        Prices are already set in stone
    private double product_one_price = 2.98;
    private double product_two_price = 4.50;
    private double product_three_price = 9.98;
    private double product_four_price = 4.49;
    private double product_five_price = 6.87;
    private double total_price;
    public String response;

//    Constructor
    public ItemCalculator() {
        this.product_one_price = getProduct_one_price();
        this.product_two_price = getProduct_two_price();
        this.product_three_price = getProduct_three_price();
        this.product_four_price = getProduct_four_price();
        this.product_five_price = getProduct_five_price();
        this.total_price = 0;
    }

//    Getters

    public double getTotal_price() {
        return total_price;
    }

    private double getProduct_one_price() {
        return product_one_price;
    }

    private double getProduct_two_price() {
        return product_two_price;
    }

    private double getProduct_three_price() {
        return product_three_price;
    }

    private double getProduct_four_price() {
        return product_four_price;
    }

    private double getProduct_five_price() {
        return product_five_price;
    }

//    Add to "cart"
    public String add_to_cart(String product) {
        switch (product) {
            case "product_one":
                add_to_total(getProduct_one_price());
                response = "200 (OK): Successfully added Product 1 into your cart.";
                break;

            case "product_two":
                add_to_total(getProduct_two_price());
                response = "200 (OK): Successfully added Product 2 into your cart.";
                break;

            case "product_three":
                add_to_total(getProduct_three_price());
                response = "200 (OK): Successfully added Product 3 into your cart.";
                break;

            case "product_four":
                add_to_total(getProduct_four_price());
                response = "200 (OK): Successfully added Product 4 into your cart.";
                break;

            case "product_five":
                add_to_total(getProduct_five_price());
                response = "200 (OK): Successfully added Product 5 into your cart.";
                break;

            default:
                response = "Unable to add item into your cart.";
                break;
        }
        return response;
    }

//     CALCULATE TOTAL
    public double add_to_total(double x) {
        total_price += x;
        return total_price;
    }
}