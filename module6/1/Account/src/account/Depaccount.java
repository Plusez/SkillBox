package account;

import java.time.LocalDate;

public class Depaccount extends Payaccount {

    public Depaccount(double balance, String nameOwner) {
        super(balance, nameOwner);
    }

    @Override
    public boolean payMoney(double paySum) {
        if (getPrevPayPeriod() < 30) {
            System.out.println("Сумма не может быть выдана, не прошло 30 дней");
            return false;
        } else {
            balance -= paySum;
            return true;
        }
    }

    public int getPrevPayPeriod() {
        int minRange = 20;              // устанавливаем срок от 20 до 40 дней.
        int maxRange = 40;
        return (int) Math.round(minRange + (maxRange - minRange) * Math.random());
    }

}
