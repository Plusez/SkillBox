package account;

public class Cardaccount extends Payaccount {

    protected static double FEE = 0.01;
    double paySum;

    public Cardaccount(double balance, String nameOwner) {
        super(balance, nameOwner);
    }

    @Override
    public boolean payMoney(double paySum) {
        super.payMoney(paySum);
        this.paySum = (paySum + paySum*FEE);
        System.out.println("FEE = " + FEE);
        //System.out.println("!paySum = " + this.paySum);
        return true;
    }
}