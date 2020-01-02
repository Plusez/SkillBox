package account;

import java.time.LocalDate;

public class Depaccount extends Payaccount {

    protected static double FEE = 0;

    public Depaccount(double balance, String nameOwner) {
        super(balance, nameOwner);
    }

    @Override
    public boolean payMoney(double paySum) {
        if (getPrevPayPeriod() < 30) {
            System.out.println("Сумма не может быть выдана, не прошло 30 дней");
            System.out.println("getPrevPayPeriod - " + getPrevPayPeriod());
            return false;
        }
        if (getPrevPayPeriod() >= 30){
            super.payMoney(paySum);
            System.out.println("getPrevPayPeriod - " + getPrevPayPeriod());
            return true;
        }
        else {
            return false;
        }
    }

    public int getPrevPayPeriod() {
        int minRange = 20;              // устанавливаем срок от 20 до 40 дней.
        int maxRange = 40;
        return (int) Math.round(minRange + (maxRange - minRange) * Math.random());
    }

}
