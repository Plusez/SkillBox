package account;

public class Payaccount {

    protected double balance;

    public Payaccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean receiveMoney(double receiveSum) {
        balance += receiveSum;
        return true;
    }

    public boolean payMoney(double paySum) {
        if ((balance - paySum) < 0) {
            System.out.println("STOP");
            return false;
        } else {
            balance -= paySum;
            System.out.println("paySum - " + paySum);
            return true;
        }
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

