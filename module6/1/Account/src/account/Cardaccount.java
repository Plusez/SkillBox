package account;

public class Cardaccount extends Payaccount {

    protected static double FEE = 0.01;
    double paySum;

    public Cardaccount(double balance) {
        super(balance);
    }

    @Override
    public boolean payMoney(double paySum) {
        if ((balance - paySum * (1 + FEE)) < 0) {
            System.out.println("STOP");
            return false;
        } else {
            super.payMoney(paySum * (1 + FEE));
            this.paySum = paySum;
            System.out.println("FEE = " + FEE);
            return true;
        }
    }
}