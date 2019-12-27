package account;

public class Payaccount {

    protected double balance;
    protected String nameOwner;
    protected boolean statusTrans;

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

    public boolean receiveMoney(double receiveSum) {
        balance += receiveSum;
        return true;
    }

    public boolean payMoney(double paySum) {
        balance -= paySum;
        return true;
    }

    public boolean transferTo(Payaccount receiveAccount, double receiveSum) {
        if (payMoney(receiveSum)) {
            receiveAccount.receiveMoney(receiveSum);
            return true;
        } else {
            System.out.println("Операция не может быть проведена, есть ограничения по счету.");
            return false;
        }
    }
}

