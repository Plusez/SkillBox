package account;

public class Payaccount {

    private double balance;

    public Payaccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean receiveMoney(double paySum) {
        balance += paySum;
        return true;
    }

    public boolean payMoney(double paySum) {
        if (balance > paySum) {
            balance -= paySum;
            System.out.println("paySum - " + paySum);
            return true;
        } else {
            System.out.println("STOP");
            return false;
        }
    }

    public boolean transferTo(Payaccount receiveAccount, double paySum) {
        if (payMoney(paySum)) {
            receiveAccount.receiveMoney(paySum);
            return true;
        } else {
            System.out.println("Операция не может быть проведена, есть ограничения по счету.");
            return false;
        }
    }
}