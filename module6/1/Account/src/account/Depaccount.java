package account;

public class Depaccount extends Payaccount {

    public Depaccount(double balance) {
        super(balance);
    }

    @Override
    public boolean payMoney(double paySum) {
        int countPayPeriod = getPrevPayPeriod();
        if (countPayPeriod < 30) {
            System.out.println("Сумма не может быть выдана, не прошло 30 дней");
            System.out.println("countPayPeriod - " + countPayPeriod);
            return false;
        } else {
            super.payMoney(paySum);
            System.out.println("countPayPeriod - " + countPayPeriod);
            return true;
        }
    }

    public int getPrevPayPeriod() {
        int minRange = 20;              // устанавливаем срок от 20 до 40 дней.
        int maxRange = 40;
        return (int) Math.round(minRange + (maxRange - minRange) * Math.random());
    }
}