package account;

public class Cardaccount extends Payaccount {

    protected double fee = 0.01;

    public Cardaccount(double balance, String nameOwner) {
        super(balance, nameOwner);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getNameOwner() {
        return nameOwner;
    }

    @Override
    public double receiveMoney(double receiveSum) {
        return balance += receiveSum;
    }

    @Override
    public double payMoney(double paySum) {
        return balance -= paySum + (paySum * fee);
    }

}
