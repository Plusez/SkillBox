package Client;

public class Corpacc extends Clientacc {

    public static double FEEOUT = 0.01;

    public Corpacc(double balance, String nameClient) {
        super(balance, nameClient);
    }

    @Override
    public boolean transOut(double transSum) {
        return super.transOut(transSum * (1 + FEEOUT));
    }
}