import java.util.Scanner;

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

        if (quantityBox == 0) {
            System.out.println("Ничего никуда не везем.");
        }
        else {
            double xBox = (double) quantityBox / maxBoxInCargo;
            quantityCargo = (int) Math.ceil(xBox);

            double xCont = (double) quantityBox / maxBoxInContainer;
            quantityContainer = (int) Math.ceil(xCont);

            for (; track <= quantityCargo; track++) {
                System.out.println(track + " Cargo");
                for (; cont <= maxContainerInCargo * track && cont <= quantityContainer; cont++) {
                    System.out.println(cont + " Cont");
                    for (; box <= maxBoxInContainer * cont && box <= quantityBox; box++) {
                        System.out.println(box + " Box");
                    }
                }
            }
        }
    }
}

