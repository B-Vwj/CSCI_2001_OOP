public class Credit {

//    Private Int Variables

    private int account_num;
    private int beginning_balance;
    private int total_charged_this_month;
    private int credits_applied;
    private int credit_limit;
    private int newBalance;


//    Constructor

    public Credit(int account_num,
                  int beginning_balance,
                  int total_charged_this_month,
                  int credits_applied,
                  int credit_limit) {
        this.account_num = account_num;
        this.beginning_balance = beginning_balance;
        this.total_charged_this_month = total_charged_this_month;
        this.credits_applied = credits_applied;
        this.credit_limit = credit_limit;
        this.newBalance = calculateNewBalance(this.beginning_balance, this.total_charged_this_month, this.credits_applied);
    }

//    Setter (or calculate) Functions

    public int calculateNewBalance(int beginning_balance, int total_charged_this_month, int credits_applied) {
        return newBalance = beginning_balance + total_charged_this_month - credits_applied;
    }

    public void setCredits_applied(int credits_applied) {
        this.credits_applied = credits_applied;
    }

    public void setTotal_charged_this_month(int total_charged_this_month) {
        this.total_charged_this_month = total_charged_this_month;
    }

//    Getter Functions

    public int getNew_balance() {
        return newBalance;
    }

    public int getBeginning_balance() {
        return beginning_balance;
    }

    public int getCredit_limit() {
        return credit_limit;
    }

    public int getCredits_applied() {
        return credits_applied;
    }

    public int getTotal_charged_this_month() {
        return total_charged_this_month;
    }

    public int getAccount_num() {
        return account_num;
    }

    //    Boolean Functions

    public boolean exceededCreditLimit(int newBalance, int credit_limit) {

        if (newBalance > credit_limit) {
            return true;
        } else {
            return false;
        }

    }

    public boolean reachedCreditLimit(int newBalance, int credit_limit) {

        if (newBalance == credit_limit) {
            return true;
        } else {
            return false;
        }

    }

}
