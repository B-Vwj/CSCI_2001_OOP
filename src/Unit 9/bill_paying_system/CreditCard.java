public class CreditCard extends Bill {
    private String vendor_name;
    private double charges;
    private double credits;
    private double total_balance;

    public CreditCard(String vendor_name, double charges, double credits) {
        super(vendor_name);
        this.charges = charges;
        this.credits = credits;
        total_balance = getPayment();
    }

    public double getPayment() {
        return this.charges - this.credits;
    }

    @Override
    public String toString() {
        return (super.toString() + "Credit Card Bill Amount: " + total_balance);
    }
}