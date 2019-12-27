package account;

public class Cardaccount extends Payaccount {

    protected double fee = 0.01;

    public Cardaccount(double balance, String nameOwner) {
        super(balance, nameOwner);
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    @Override
    public boolean receiveMoney(double receiveSum) {
        balance += receiveSum;
        return true;
    }

    @Override
    public boolean payMoney(double paySum) {
        balance -= paySum + (paySum * fee);
        return true;
    }
}