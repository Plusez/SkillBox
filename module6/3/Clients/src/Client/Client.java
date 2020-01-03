package Client;

abstract public class Client {
    public int account;
    public double paySum;
    double fee;

    public void  transIn(double paySum, double fee) {
        this.account += paySum - paySum*fee;
    }

    public void transOut(double paySum, double fee) {
        this.account -= paySum - paySum*fee;
    }

    public double getBalance() {
        return this.account;
    }
}
