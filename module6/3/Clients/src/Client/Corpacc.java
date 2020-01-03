package Client;

public class Corpacc extends Clientacc {

    public static double FEEOUT = 0.01;

    public Corpacc(double balance, String nameClient) {
        super(balance, nameClient);
    }

    @Override
    public boolean transOut(double transSum) {
        if (getBalance() < transSum * (1 + FEEOUT)) {
            System.out.println("Операция невозможна. Сумма больше остатка на счете");
            return false;
        } else {
            super.balance -= transSum * (1 + FEEOUT);
            return true;
        }
    }
}