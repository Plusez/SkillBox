package account;

public class Payaccount {

   public double balance;

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
        if (balance >= paySum) {
            balance -= paySum;
//            System.out.println("Выполнили payMoney. paySum - " + paySum);
            return true;
        } else {
            System.out.println("STOP");
            return false;
        }
    }

    public boolean transferTo(Payaccount receiveAccount, double paySum) {
        if (payMoney(paySum)) {
//            System.out.println("2 - " + receiveAccount.getBalance());
//            System.out.println("payMoney(paySum) в методе receiveMoney - " + payMoney(paySum));
            receiveAccount.receiveMoney(paySum);
//            System.out.println("2 - " + receiveAccount.getBalance());
            return true;
        } else {
            System.out.println("Операция не может быть проведена, есть ограничения по счету.");
            return false;
        }
    }
}