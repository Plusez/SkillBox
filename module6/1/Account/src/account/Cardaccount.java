package account;

public class Cardaccount extends Payaccount {

    protected static double FEE = 0.01;
    double paySum;

    public Cardaccount(double balance, String nameOwner) {
        super(balance, nameOwner);
    }

    @Override
    public boolean payMoney(double paySum) {
        super.payMoney(paySum * (1 + FEE));
        this.paySum = paySum;
        System.out.println("FEE = " + FEE);
        return true;
    }
}