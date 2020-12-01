public abstract class Bill implements Payable {
    private String vendor_name;
    public abstract double getPayment();

    public Bill(String vendor_name) {
        this.vendor_name = vendor_name;
    }

    @Override
    public String toString() {
        return ("\nBill Type: " + vendor_name + "\n");
    }
}