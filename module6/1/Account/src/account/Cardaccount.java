package account;

public class Cardaccount extends Payaccount {

    private static final double FEE = 0.01;

    public Cardaccount(double balance) {
        super(balance);
    }

    @Override
    public boolean payMoney(double paySum) {
        super.payMoney(paySum * (1 + FEE));
        System.out.println("FEE = " + FEE);
        return true;
    }
}