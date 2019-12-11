import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = cat4.clone();
        Cat petrovich = new Cat("petrovich");

        System.out.println("cat1 - " + cat1.getStatus());
        System.out.println("cat2 - " + cat2.getStatus());
        System.out.println("cat3 - " + cat3.getStatus());
        System.out.println("cat4 - " + cat4.getStatus());
        System.out.println("weight cat4 - " + cat4.getWeight());
        cat4.feed(100.0);
        System.out.println("weight cat4 - " + cat4.getWeight());
        System.out.println("color cat4 - " + cat4.getCatsColor());
        System.out.println("weight cat5 - " + cat5.getWeight());
        System.out.println("color cat5 - " + cat5.getCatsColor());
        System.out.println("petrovich - " + petrovich.getStatus());

        System.out.println("первоначальный вес кошки #1 - " + cat1.getWeight());
        cat1.feed(150.0);
        cat1.feed(200.0);
        System.out.println("вес кошки #1 после еды - " + cat1.getWeight());
        System.out.println("после еды кошка - " + cat1.getStatus());
        System.out.println("масса съеденной еды - " + cat1.feedCat);
        cat1.goToToilet();
        System.out.println("вес после туалета - " + cat1.getWeight());

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Кошка будет мяукать? (1 - да, 0 - нет) ");
        int doingMeow = sc2.nextInt();

        if (doingMeow == 1) {

            do {
                cat2.meow();
            }
            while (cat2.getStatus() != "Dead");
        } else {
            System.out.println("Концерт откладывается");
        }
        System.out.println("осталось кошек - " + Cat.getCount());
    }
}