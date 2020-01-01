package account;

public class Cardaccount extends Payaccount {

    protected double fee = 0.01;

    public Cardaccount(double balance, String nameOwner) {
        super(balance, nameOwner);
    }

    @Override
    public boolean payMoney(double paySum) {
        balance -= paySum + (paySum * fee);
        return true;
    }
}