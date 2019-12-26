package account;

public class Payaccount {

    protected double balance;
    protected String nameOwner;

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


    public double transferTo(Payaccount receiveAccount, double receiveSum) {
        double inSum = getBalance();
        payMoney(receiveSum);
        double outSum = getBalance();
        if (inSum != outSum) {
            receiveAccount.receiveMoney(receiveSum);
        } else {
            System.out.println("Операция не может быть проведена, есть ограничения по счету.");
        }
        return 0;
    }
}

