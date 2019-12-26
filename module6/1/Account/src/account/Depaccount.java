package account;

import java.time.LocalDate;

public class Depaccount extends Payaccount {

    public Depaccount(double balance, String nameOwner) {
        super(balance, nameOwner);
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public double receiveMoney(double receiveSum) {
        return this.balance += receiveSum;
    }

    @Override
    public String getNameOwner() {
        return nameOwner;
    }

    @Override
    public double payMoney(double paySum) {
        if (getPrevPayPeriod() < 30) {
            System.out.println("Сумма не может быть выдана, не прошло 30 дней");
        } else {
            balance -= paySum;
        }
        return balance;
    }

    public int getPrevPayPeriod() {
        int minRange = 20;
        int maxRange = 40;
        return (int) Math.round(minRange + (maxRange - minRange) * Math.random());

    }

}
