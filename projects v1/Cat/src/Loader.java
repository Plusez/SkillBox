
public class Loader implements Cloneable {


    public static void main(String[] args) {
        Cat murzik = new Cat();
        Cat vaska = new Cat();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat (cat1.getWeight());
        Cat cat6 = new Cat ();
        Cat cat7 = cat1.clone();

        Kitten kitty = new Kitten();

        System.out.println(murzik.getWeight() + " - murzik");
        System.out.println(vaska.getWeight() + " - vaska");
        System.out.println(cat1.getWeight() + " - cat1");
        System.out.println(cat2.getWeight() + " - cat2");
        System.out.println(cat3.getWeight() + " - cat3");
        System.out.println(cat4.getWeight() + " - cat4");
        System.out.println(cat5.getWeight() + " - cat5");
        System.out.println(cat6.getWeightCat() + " - cat6");
        System.out.println(kitty.getWeight() + " - kitty");
        System.out.println(cat7.getWeight() + " - cat 7 is copy cat 1");


// Цикл из предыдущего задания
//        Integer i;
//
//            for (i = 0; i < 10000; i++) {
//                if (murzik.getStatus().equals("Sleeping")) {
//                    murzik.meow();
//                }
//                else i = 10000;  //System.out.println(murzik.getStatus() + " -some cat");
//
//            }
//                System.out.println(murzik.getStatus() + " -some  cat");



        for (Integer y = 0; y < 10000; y++) {

            cat1.feed(1.);
            if (cat1.weight > cat1.maxWeight) {
                cat1.eatWeight = y;
                break;

            }

        }
        System.out.println("weight cat1 after eat - " + cat1.getWeight());
        System.out.println("status cat1 - " + cat1.getStatus());
        System.out.println("eaten cat1 " + cat1.eatWeight());
        System.out.println("fromToilett cat2 " + cat2.fromToilett());
        System.out.println("There are " + Cat.count + " cats of constructor № 1");
        System.out.println("There are " + Cat.count2 + " cats of constructor № 2");
        System.out.println("There are " + kitty.getCount() + " kitten");
        System.out.println("Weight cat from second Cat-method " + cat6.weight);

// Пример из урока
        //        String str = "MURZIK";
//        System.out.println(str);
//        System.out.println(str.toLowerCase());
//
//        System.out.println("murzik " + murzik.getWeight());
//        System.out.println("vaska " + vaska.getWeight());
//        System.out.println("difference " + Cat.getWeightdifference(murzik, vaska));
    }
}