package account;

public class Payaccount {

    public double balance;
    public String nameOwner;
    public double receiveSum;
    public double paySum;

    public Payaccount(double balance, String nameOwner) {
        this.balance = balance;
        this.nameOwner = nameOwner;
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
        return balance -= paySum;
    }

}
