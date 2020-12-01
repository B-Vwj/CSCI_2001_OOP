public class ElectricBill extends Bill {
    private String vendor_name;
    private double base_charge;
    private double kWh_per_hour_cost;
    private double kWh_amount_consumed;
    private double total_balance;

    public ElectricBill(String vendor_name, double base_charge, double kWh_per_hour_cost, double kWh_amount_consumed) {
        super(vendor_name);
        this.base_charge = base_charge;
        this.kWh_per_hour_cost = kWh_per_hour_cost;
        this.kWh_amount_consumed = kWh_amount_consumed;
        total_balance = getPayment();
    }

    public double getPayment() {
        return (this.base_charge + kWh_per_hour_cost * kWh_amount_consumed);
    }

    @Override
    public String toString() {
        return (super.toString() + "Electric Bill Amount: " + total_balance);
    }
}