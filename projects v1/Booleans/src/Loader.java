
public class Loader {
    public static void main(String[] args) {
        Integer milkAmount = 100; // ml
        Integer powderAmount = 1300; // g
        Integer eggsCount = 15; // items
        Integer sugarAmount = 15; // g
        Integer oilAmount = 130; // ml
        Integer appleCount = 1;
        Boolean isBakertoday = false;

        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        if (powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30) {
            isBakertoday = true;
            System.out.println("Pancakes");
        }
        //milk - 300 ml, powder - 5 g, eggs - 5
        if (milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5) {
            isBakertoday = true;
            System.out.println("Omelette");
        }
        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        if (appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 & eggsCount >= 4) {
            isBakertoday = true;
            System.out.println("Apple pie");
        }
        if (isBakertoday != true) {
            System.out.println("You are not Baker today");
        }
    }
}
