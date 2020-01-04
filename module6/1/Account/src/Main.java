import account.Cardaccount;
import account.Depaccount;
import account.Payaccount;

public class Main {

    public static void main(String[] args) {

        Payaccount payAccount1 = new Payaccount(100.0);
        Payaccount payAccount2 = new Payaccount(150.0);
        Payaccount payAccount3 = new Payaccount(180.0);

        System.out.println("payaccount1 - " + payAccount1.getBalance());
        System.out.println("payaccount2 - " + payAccount2.getBalance());
        System.out.println("payaccount3 - " + payAccount3.getBalance());
        System.out.println();

        System.out.println("Сумма к получению - 100, 110, 170");
        payAccount1.receiveMoney(100.0);
        payAccount2.receiveMoney(110.0);
        payAccount3.receiveMoney(170.0);

        System.out.println("payaccount1 - " + payAccount1.getBalance());
        System.out.println("payaccount2 - " + payAccount2.getBalance());
        System.out.println("payaccount3 - " + payAccount3.getBalance());
        System.out.println();

        Depaccount depAccount1 = new Depaccount(100.0);
        System.out.println("depaccount1 - " + depAccount1.getBalance());
        System.out.println("Сумма снятия - 50");
        depAccount1.payMoney(50.0);
        System.out.println("depaccount1 - " + depAccount1.getBalance());
        System.out.println();

        Cardaccount cardAccount1 = new Cardaccount(100.0);
        System.out.println("cardAccount1 - " + cardAccount1.getBalance());
        System.out.println("Сумма снятия - 50");
        cardAccount1.payMoney(50.0);
        System.out.println("cardAccount1 - " + cardAccount1.getBalance());
        System.out.println();

        System.out.println("Пробуем переводы");
        System.out.println("in balance payAccount1 - " + payAccount1.getBalance());
        System.out.println("in balance depAccount1 - " + depAccount1.getBalance());
        System.out.println("in balance cardAccount1 - " + cardAccount1.getBalance());
        System.out.println();

        payAccount1.transferTo(cardAccount1, 50.0);
        System.out.println("payAccount1.transferTo(cardAccount1)");
        System.out.println("payAccount1 - " + payAccount1.getBalance());
        System.out.println("cardAccount1 - " + cardAccount1.getBalance());
        System.out.println();

        payAccount1.transferTo(depAccount1, 50.0);
        System.out.println("payAccount1.transferTo(depAccount1)");
        System.out.println("payAccount1 - " + payAccount1.getBalance());
        System.out.println("depAccount1 - " + depAccount1.getBalance());
        System.out.println();

        depAccount1.transferTo(payAccount1, 50.0);
        System.out.println("depAccount1.transferTo(payAccount1)");
        System.out.println("depAccount1 - " + depAccount1.getBalance());
        System.out.println("payAccount1 - " + payAccount1.getBalance());
        System.out.println();

        depAccount1.transferTo(cardAccount1, 50.0);
        System.out.println("depAccount1.transferTo(cardAccount1)");
        System.out.println("depAccount1 - " + depAccount1.getBalance());
        System.out.println("cardAccount1 - " + cardAccount1.getBalance());
        System.out.println();

        cardAccount1.transferTo(payAccount1, 50.0);
        System.out.println("cardAccount1.transferTo(payAccount1)");
        System.out.println("cardAccount1 - " + cardAccount1.getBalance());
        System.out.println("payAccount1 - " + payAccount1.getBalance());
        System.out.println();

        cardAccount1.transferTo(depAccount1, 50.0);
        System.out.println("cardAccount1.transferTo(depAccount1)");
        System.out.println("cardAccount1 - " + cardAccount1.getBalance());
        System.out.println("depAccount1 - " + depAccount1.getBalance());
    }
}
