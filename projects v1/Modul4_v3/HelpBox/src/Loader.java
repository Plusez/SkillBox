import java.util.Scanner;

import static java.lang.Double.MAX_VALUE;
import static java.lang.Double.MIN_VALUE;

public class Loader {

    public static void main(String[] args) {

        Integer quantityCargo;
        Integer quantityContainer;
        Integer quantityBox;
        Integer maxBoxInContainer = 27;
        Integer maxContainerInCargo = 12;
        Integer maxBoxInCargo = maxBoxInContainer * maxContainerInCargo;
        Integer track = 1;
        Integer cont = 1;
        Integer box = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input quantity of box: ");
        quantityBox = sc.nextInt();

        if (quantityBox > 0 && quantityBox < maxBoxInCargo) {
            quantityCargo = 1;
        } else if (quantityBox % maxBoxInCargo > 0) {
            quantityCargo = (int) quantityBox / maxBoxInCargo + 1;
        } else {
            quantityCargo = 0;
            System.out.println("Cargo - " + quantityCargo);
        }

        if (quantityBox < maxBoxInContainer + 1 && quantityBox > 0) {
            quantityContainer = 1;
        } else if (quantityBox > maxBoxInContainer && quantityBox % maxBoxInContainer > 0) {
            quantityContainer = (int) quantityBox / maxBoxInContainer + 1;
        } else if (quantityBox > 0 && quantityBox % maxBoxInContainer == 0) {
            quantityContainer = quantityBox / maxBoxInContainer;
        } else {
            quantityContainer = 0;
            System.out.println("Cont - " + quantityContainer);
        }

        for ( ; track <= quantityCargo; track++) {
            System.out.println(track + " Cargo");
            for ( ; cont <= maxContainerInCargo * track && cont <= quantityContainer; cont++) {
                System.out.println(cont + " Cont");
                for ( ; box <= maxBoxInContainer * cont && box <= quantityBox; box++) {
                    System.out.println(box + " Box");
                }
            }
        }
//        System.out.println();
//        System.out.println("Задание к уроку 4.3.");
//        double r = MAX_VALUE;
//        double t = MIN_VALUE;
//        System.out.println("максимальное значение double - " + MAX_VALUE);
//        System.out.println("минимальное значение double - " + MIN_VALUE);
//        double i = 24.0;
//        double u = 0.1;
//        double o = i * u;
//        double o2 = i * 0.2;
//        double o3 = i * 0.3;
//        double o4 = i * 0.4;
//        double o5 = i * 1.1;
//        double o6 = i * 10.1;
//        System.out.println("Это результат умножения 24.0 на 0.1 - " + o);
//        System.out.println("Это результат умножения 24.0 на 0.2 - " + o2);
//        System.out.println("Это результат умножения 24.0 на 0.3 - " + o3);
//        System.out.println("Это результат умножения 24.0 на 0.4 - " + o4);
//        System.out.println("Это результат умножения 24.0 на 1.1 - " + o5);
//        System.out.println("Это результат умножения 24.0 на 10.1 - " + o6);

    }
}

