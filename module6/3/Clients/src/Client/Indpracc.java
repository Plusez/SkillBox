package Client;

public class Indpracc extends Clientacc {

    private static double FEE1 = 0.01;
    private static double FEE05 = 0.005;

    public Indpracc(double balance, String nameClient) {
        super(balance, nameClient);
    }

    @Override
    public boolean transIn(double transSum) {
        if (transSum < 1000) {
            super.balance += transSum * (1 - FEE1);
            return true;
        } else {
            super.balance += transSum * (1 - FEE05);
            return true;
        }
    }
}