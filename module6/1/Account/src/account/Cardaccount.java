package account;

public class Cardaccount extends Payaccount {

    double fee = 0.01;

    public Cardaccount(double balance, String nameOwner) {
        super(balance, nameOwner);
    }

    public double getBalance() {
        return balance;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public double receiveMoney(double receiveSum) {
        return balance += receiveSum;
    }

    public double payMoney(double paySum) {
        return balance -= paySum + (paySum * fee);
    }

}
