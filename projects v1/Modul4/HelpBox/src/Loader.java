import java.util.Scanner;

public class Loader {

    public static void main(String[] args) {

        Integer quantCarg;
        Integer quantCont;
        Integer x = 1;
        Integer y = 1;
        Integer z = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input quantity of box: ");
        Integer quantBox = sc.nextInt();

        if (quantBox < 305) {
            quantCarg = 1;
        } else if (quantBox % 304 > 0) {
            quantCarg = (int) quantBox / 304 + 1;
        } else quantCarg = 0;

        if (quantBox < 28) {
            quantCont = 1;
        } else if (quantBox > 27 & quantBox % 27 > 0) {
            quantCont = (int) quantBox / 27 + 1;
        } else if (quantBox % 27 == 0) {
            quantCont = quantBox / 27;
        } else quantCont = 0;

        do {
            System.out.println(x + " Cargo");
            do {
                System.out.println(y + " Cont");
                do {
                    System.out.println(z + " Box");
                    z = z + 1;
                } while (z <= 27 * y & z < quantBox+1);
                y = y + 1;
            } while (y <= 12 * x & y <= quantCont);
            x= x + 1;
        } while (x <= quantCarg);

    }
}

