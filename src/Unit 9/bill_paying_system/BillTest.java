import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigDecimal;

public class BillTest {
    public static void main(String args[]) {

        int bill_type;
        double total_amount_owed = 0.0;

        ArrayList<Bill> al = new ArrayList<Bill>();
        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.println();
            System.out.println("What bill do you want to add? Type the name of it. ");
            System.out.println("1 for 'Mortgage', 2 for 'Credit Card', or 3 for 'Electric' bills?");
            System.out.println("Or quit adding and print the total amount by entering in -1");
            bill_type = Integer.parseInt(s.nextLine());

            if (bill_type == -1) {
                break;
            } else if (bill_type == 1 || bill_type == 2 || bill_type == 3) {
                switch(bill_type){
                    case 1:
                        System.out.println("Principal?");
                        double principal_amount = Double.parseDouble(s.nextLine());
                        System.out.println("Interest?");
                        double interest_amount = Double.parseDouble(s.nextLine());
                        System.out.println("Taxes?");
                        double tax_amount = Double.parseDouble(s.nextLine());
                        System.out.println("Insurance?");
                        double insurance_amount = Double.parseDouble(s.nextLine());
                        String mortgage = "Mortgage";

                        Mortgage m = new Mortgage(mortgage, principal_amount, insurance_amount, tax_amount, insurance_amount);
                        al.add(m);
                        break;
                    case 2:
                        System.out.println("Charges?");
                        double charge_amount = Double.parseDouble(s.nextLine());
                        System.out.println("Credits?");
                        double credit_amount = Double.parseDouble(s.nextLine());
                        String credit = "Credit Card";

                        CreditCard cc = new CreditCard(credit, charge_amount, credit_amount);
                        al.add(cc);
                        break;
                    case 3:
                        System.out.println("Base Charge Fee?");
                        double base_fee_amount = Double.parseDouble(s.nextLine());
                        System.out.println("Cost per kilowatt-hour (kWh)?");
                        double kWh_hourly_amount = Double.parseDouble(s.nextLine());
                        System.out.println("Number of kWh consumed?");
                        double kWh_consumed_amount = Double.parseDouble(s.nextLine());
                        String electric = "Electricity";

                        ElectricBill e = new ElectricBill(electric, base_fee_amount, kWh_hourly_amount, kWh_consumed_amount);
                        al.add(e);
                        break;
                }
            }
        }

        // Print array list of all Bill objects
        System.out.println();
        System.out.println(al);
        System.out.println();

        for (int i = 0; i < al.size(); i++) {
            total_amount_owed += al.get(i).getPayment();
        }

        System.out.println("Total Amount Due for the Month: " + total_amount_owed);

    }
}