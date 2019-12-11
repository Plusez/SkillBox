import java.util.Scanner;

import static java.lang.Double.MAX_VALUE;
import static java.lang.Double.MIN_VALUE;

public class Loader {

    public static void main(String[] args) {

        Integer quantityCargo;
        Integer quantityContainer;
        Integer quantityBox;
        Integer maxBoxinCargo = 304;
        Integer maxBoxinContainer = 27;
        Integer maxContainerinCargo = 12;
        Integer x = 1;
        Integer y = 1;
        Integer z = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input quantity of box: ");
        quantityBox = sc.nextInt();

        if (quantityBox < maxBoxinCargo + 1) {
            quantityCargo = 1;
        } else if (quantityBox % maxBoxinCargo > 0) {
            quantityCargo = (int) quantityBox / maxBoxinCargo + 1;
        } else quantityCargo = 0;

        if (quantityBox < maxBoxinContainer + 1) {
            quantityContainer = 1;
        } else if (quantityBox > maxBoxinContainer & quantityBox % maxBoxinContainer > 0) {
            quantityContainer = (int) quantityBox / maxBoxinContainer + 1;
        } else if (quantityBox % maxBoxinContainer == 0) {
            quantityContainer = quantityBox / maxBoxinContainer;
        } else quantityContainer = 0;

        do {
            System.out.println(x + " Cargo");
            do {
                System.out.println(y + " Cont");
                do {
                    System.out.println(z + " Box");
                    z = z + 1;
                } while (z <= maxBoxinContainer * y & z < quantityBox);
                y = y + 1;
            } while (y <= maxContainerinCargo * x & y <= quantityContainer);
            x= x + 1;
        } while (x <= quantityCargo);

        System.out.println();
        System.out.println("Задание к уроку 4.3.");
        double r = MAX_VALUE;
        double t = MIN_VALUE;
        System.out.println("максимальное значение double - " + MAX_VALUE);
        System.out.println("минимальное значение double - " + MIN_VALUE);
        double i = 24.0;
        double u = 0.1;
        double o = i * u;
        System.out.println("Это результат умножения 24.0 на 0.1 - " + o);
    }
}

