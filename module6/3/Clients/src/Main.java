import Client.Corpacc;
import Client.Indpracc;
import Client.Privateacc;

public class Main {

    public static void main(String[] args) {

        Corpacc corpAcc1 = new Corpacc(5000.0, "OOO 1");
        System.out.println("corpAcc1 - " + corpAcc1.getBalance());
        corpAcc1.transIn(5000.0);
        System.out.println("corpAcc1 after transIn 5000 - " + corpAcc1.getBalance());
        corpAcc1.transOut(600.0);
        System.out.println("corpAcc1 after transOut 600 - " + corpAcc1.getBalance());
        System.out.println();

        Indpracc indprAcc1 = new Indpracc(800.0, "IP1");
        System.out.println("indprAcc1 - " + indprAcc1.getBalance());
        indprAcc1.transIn(500.0);
        System.out.println("indprAcc1 after transIn 500 - " + indprAcc1.getBalance());
        indprAcc1.transOut(400.0);
        System.out.println("indprAcc1 after transOut 400 - " + indprAcc1.getBalance());
        System.out.println();

        Indpracc indprAcc2 = new Indpracc(1000.0, "IP2");
        System.out.println("indprAcc2 - " + indprAcc2.getBalance());
        indprAcc2.transIn(5000.0);
        System.out.println("indprAcc2 after transIn 5000 - " + indprAcc2.getBalance());
        indprAcc2.transOut(4000.0);
        System.out.println("indprAcc2 after transOut 4000 - " + indprAcc2.getBalance());
        System.out.println();

        Privateacc privateAcc1 = new Privateacc(100.0, "Ivanov");
        System.out.println("privateAcc1 - " + privateAcc1.getBalance());
        privateAcc1.transIn(50.0);
        System.out.println("privateAcc1 after transIn 50 - " + privateAcc1.getBalance());
        privateAcc1.transOut(40.0);
        System.out.println("privateAcc1 after transOut 40 - " + privateAcc1.getBalance());
        System.out.println();
    }
}
