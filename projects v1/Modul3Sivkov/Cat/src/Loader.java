
public class Loader {
    public static void main(String[] args) {
        Cat murzik = new Cat();
        Cat vaska = new Cat();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat(cat1.weight2Cat);
        Kitten kitty = new Kitten();

        System.out.println(murzik.getWeight() + " -murzik");
        System.out.println(vaska.getWeight() + " -vaska");
        System.out.println(cat1.getWeight() + " -cat1");
        System.out.println(cat2.getWeight() + " -cat2");
        System.out.println(cat3.getWeight() + " -cat3");
        System.out.println(cat4.getWeight() + " -cat4");
        System.out.println(cat5.getWeight() + " -cat5");
        System.out.println(cat6.getWeightCat() + " -cat6");
        System.out.println(kitty.getWeight() + " - kitty");


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


        // Если в цикле поставить y+1000, то он перестает работать
        Integer y;
        for (y = 0; y < 10000; y++) {

            cat1.feed(1.);
            if (cat1.getStatus().equals("Dead")) {
                y = 100000;
            }
            if (cat1.getStatus().equals("Exploded")) {
                y = 100000;
            }

        }
        System.out.println(cat1.getWeight());
        //   System.out.println(y);
        System.out.println("status cat1 - " + cat1.getStatus());
        System.out.println("eaten cat1 " + cat1.eatWeight());
        System.out.println("fromToilett cat1 " + cat1.fromToilett());
        System.out.println("There are " + cat1.getCount() + " cats");
        System.out.println("There are " + kitty.getCount() + " kitten");
        System.out.println("Weight cat from second Cat-method " + cat6.weight2Cat);
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