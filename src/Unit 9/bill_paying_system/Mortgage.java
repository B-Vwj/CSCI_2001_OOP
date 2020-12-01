public class Mortgage extends Bill {
    private String vendor_name; // Instantiated when User picks bill
    private double principal;
    private double interest;
    private double taxes;
    private double insurance;
    private double total_balance;

    public Mortgage(String vendor_name, double principal, double interest, double taxes, double insurance) {
        super(vendor_name);
        this.principal = principal;
        this.interest = interest;
        this.taxes = taxes;
        this.insurance = insurance;
        total_balance = getPayment();
    }

    public double getPayment() {
        return (this.principal + this.interest + this.taxes + this.insurance);
    }

    @Override
    public String toString() {
        return (super.toString() + "Mortgage Bill Amount: " + total_balance);
    }
}