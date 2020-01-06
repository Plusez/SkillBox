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
        System.out.println("payAccount1.transferTo(payAccount2, 50)");
        payAccount1.transferTo(payAccount2, 50);
        System.out.println("payaccount1 - " + payAccount1.getBalance());
        System.out.println("payaccount2 - " + payAccount2.getBalance());

        System.out.println();

        System.out.println("Получаем деньги. Сумма к получению - 100, 110, 170");
        payAccount1.receiveMoney(100.0);
        payAccount2.receiveMoney(110.0);
        payAccount3.receiveMoney(170.0);

        System.out.println("payaccount1 - " + payAccount1.getBalance());
        System.out.println("payaccount2 - " + payAccount2.getBalance());
        System.out.println("payaccount3 - " + payAccount3.getBalance());
        System.out.println();

        Depaccount depAccount1 = new Depaccount(200.0);
        System.out.println("Создаем depaccount1 - " + depAccount1.getBalance());
        System.out.println("Сумма снятия - 50");
        depAccount1.payMoney(50.0);
        System.out.println("Остаток depaccount1 - " + depAccount1.getBalance());
        System.out.println();
        Depaccount depAccount2 = new Depaccount(100.0);
        System.out.println("Создаем depaccount2 - " + depAccount2.getBalance());

        Cardaccount cardAccount1 = new Cardaccount(100.0);
        Cardaccount cardAccount2 = new Cardaccount(100.0);
        System.out.println("Создаем cardAccount1 - " + cardAccount1.getBalance());
        System.out.println("Создаем cardAccount2 - " + cardAccount2.getBalance());
        System.out.println("Сумма снятия - 50");
        cardAccount1.payMoney(50.0);
        System.out.println("Остаток cardAccount1 - " + cardAccount1.getBalance());
        System.out.println();

        System.out.println("Пробуем переводы");
        System.out.println();
        System.out.println("cardAccount1.transferTo(cardAccount2, 500)");
        System.out.println("in balance cardAccount1 - " + cardAccount1.getBalance());
        System.out.println("in balance cardAccount2 - " + cardAccount2.getBalance());
        cardAccount1.transferTo(cardAccount2, 500.0);
        System.out.println("in balance cardAccount1 - " + cardAccount1.getBalance());
        System.out.println("in balance cardAccount2 - " + cardAccount2.getBalance());
        System.out.println();
        System.out.println("cardAccount1.transferTo(cardAccount2, 5)");
        cardAccount1.transferTo(cardAccount2, 5.0);
        System.out.println("in balance cardAccount1 - " + cardAccount1.getBalance());
        System.out.println("in balance cardAccount2 - " + cardAccount2.getBalance());
        System.out.println();
        System.out.println("in balance paydAccount1 - " + payAccount1.getBalance());
        System.out.println("in balance cardAccount1 - " + cardAccount1.getBalance());
        payAccount1.transferTo(cardAccount1, 50.0);
        System.out.println("payAccount1.transferTo(cardAccount1, 50)");
        System.out.println("payAccount1 - " + payAccount1.getBalance());
        System.out.println("cardAccount1 - " + cardAccount1.getBalance());
        System.out.println();
        System.out.println("payAccount1 - " + payAccount1.getBalance());
        System.out.println("depAccount1 - " + depAccount1.getBalance());
        System.out.println("payAccount1.transferTo(depAccount1, 50)");
        payAccount1.transferTo(depAccount1, 50.0);
        System.out.println("payAccount1 - " + payAccount1.getBalance());
        System.out.println("depAccount1 - " + depAccount1.getBalance());
        System.out.println();
        System.out.println("depAccount1.transferTo(payAccount1) - 500");
        System.out.println("depAccount1 - " + depAccount1.getBalance());
        System.out.println("payAccount1 - " + payAccount1.getBalance());
        depAccount1.transferTo(payAccount1, 500.0);
        System.out.println("depAccount1 - " + depAccount1.getBalance());
        System.out.println("payAccount1 - " + payAccount1.getBalance());
        System.out.println();

        System.out.println("depAccount1.transferTo(depAccount2) - 50");
        System.out.println("depAccount1 - " + depAccount1.getBalance());
        System.out.println("depAccount2 - " + depAccount2.getBalance());
        depAccount1.transferTo(depAccount2, 50.0);
        System.out.println("depAccount1 - " + depAccount1.getBalance());
        System.out.println("depAccount2 - " + depAccount2.getBalance());
        System.out.println();
        System.out.println("depAccount1.transferTo(depAccount2) - 500");
        System.out.println("depAccount1 - " + depAccount1.getBalance());
        System.out.println("depAccount2 - " + depAccount2.getBalance());
        depAccount1.transferTo(depAccount2, 500.0);
        System.out.println("depAccount1 - " + depAccount1.getBalance());
        System.out.println("depAccount2 - " + depAccount2.getBalance());
        System.out.println();
        System.out.println("depAccount1.transferTo(cardAccount1) - 50");
        System.out.println("depAccount1 - " + depAccount1.getBalance());
        System.out.println("cardAccount1 - " + cardAccount1.getBalance());
        depAccount1.transferTo(cardAccount1, 50.0);
        System.out.println("depAccount1 - " + depAccount1.getBalance());
        System.out.println("cardAccount1 - " + cardAccount1.getBalance());
        System.out.println();
        System.out.println("cardAccount1.transferTo(payAccount1) - 50");
        System.out.println("cardAccount1 - " + cardAccount1.getBalance());
        System.out.println("payAccount1 - " + payAccount1.getBalance());
        cardAccount1.transferTo(payAccount1, 50.0);
        System.out.println("cardAccount1 - " + cardAccount1.getBalance());
        System.out.println("payAccount1 - " + payAccount1.getBalance());
        System.out.println();
        System.out.println("cardAccount1.transferTo(depAccount1) - 50");
        System.out.println("cardAccount1 - " + cardAccount1.getBalance());
        System.out.println("depAccount1 - " + depAccount1.getBalance());
        cardAccount1.transferTo(depAccount1, 50.0);
        System.out.println("cardAccount1 - " + cardAccount1.getBalance());
        System.out.println("depAccount1 - " + depAccount1.getBalance());
    }
}
