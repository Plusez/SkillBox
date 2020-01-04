package Client;

public abstract class Clientacc {
    public double balance;
    String nameClient;

    Clientacc(double balance, String nameClient) {
        this.balance = balance;
        this.nameClient = nameClient;
    }

    public double getBalance() {
        return balance;
    }

    public boolean transIn(double transSum) {
        balance += transSum;
        return true;
    }

    public boolean transOut(double transSum) {
        if (balance < transSum) {
            System.out.println("STOP");
            return false;
        } else {
            balance -= transSum;
            return true;
        }
    }
}