import account.Cardaccount;
import account.Depaccount;
import account.Payaccount;

public class Main {

    public static void main(String[] args) {

        Payaccount payaccount1 = new Payaccount(100.0, "Smith");
        Payaccount payaccount2 = new Payaccount(150.0, "Ivan");
        Payaccount payaccount3 = new Payaccount(180.0, "Adam");

        System.out.println("payaccount1 - " + payaccount1.getBalance() + " - " + payaccount1.getNameOwner());
        System.out.println("payaccount2 - " + payaccount1.getBalance() + " - " + payaccount2.getNameOwner());
        System.out.println("payaccount3 - " + payaccount1.getBalance() + " - " + payaccount3.getNameOwner());


        System.out.println("Сумма к получению - 100");
        payaccount1.receiveMoney(100.0);
        payaccount2.receiveMoney(110.0);
        payaccount3.receiveMoney(170.0);

        System.out.println("payaccount1 - " + payaccount1.getBalance() + " - " + payaccount1.getNameOwner());
        System.out.println("payaccount2 - " + payaccount2.getBalance() + " - " + payaccount2.getNameOwner());
        System.out.println("payaccount3 - " + payaccount3.getBalance() + " - " + payaccount3.getNameOwner());

        Depaccount depAccount1 = new Depaccount(100.0, "Smith");
        System.out.println("depaccount1 - " + depAccount1.getBalance() + " - " + depAccount1.getNameOwner());
        System.out.println("Сумма снятия - 100");
        System.out.println("getPrevPayPeriod - " + depAccount1.getPrevPayPeriod());
        depAccount1.payMoney(100.0);
        System.out.println("depaccount1 - " + depAccount1.getBalance() + " - " + depAccount1.getNameOwner());

        Cardaccount cardAccount1 = new Cardaccount(100.0, "Petrov");
        System.out.println("cardAccount1 - " + cardAccount1.getBalance() + " - " + cardAccount1.getNameOwner());
        System.out.println("Сумма снятия - 50");
        cardAccount1.payMoney(50.0);
        System.out.println("cardAccount1 - " + cardAccount1.getBalance() + " - " + cardAccount1.getNameOwner());
    }
}
