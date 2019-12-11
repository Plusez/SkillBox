import java.util.Scanner; // импорт сканера

class Test {
    public static void main(String[] args) {

        String Str = new String("Добро пожаловать на ProgLang.su");

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.replaceAll("(.*)ProgLang(.*)",
                "IAMGROOT"));

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.replaceAll("ProgLang.su",
                "сайт посвященный программированию!"));

//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите любые 2 слова или фразу: ");
//        String phrase1 = sc.nextLine();
//        String phrase2 = sc.nextLine();
//        System.out.println(phrase1 + " " + phrase2);
//    }
//
//        public static void main(String args[]){
//            System.out.print("Введите любое число "); // от 1 до 10: ");
//            Scanner scan = new Scanner(System.in);
//            int number = scan.nextInt();
//            System.out.println ("Вы ввели число " + number);
//        }

//        long x = Math.round(1660.0 / 100);
//        System.out.println("значение х: " + x);
//        String str = "1234567";
//        Integer number = Integer.parseInt(str);
//        System.out.println(number + 500);

//        Integer x1 = Integer.MAX_VALUE;
//        Integer x2 = Integer.MIN_VALUE;
//        Double x3 = Double.MAX_VALUE;
//        Double x4 = Double.MIN_VALUE;
//        Short x5 = Short.MAX_VALUE;
//        Short x6 = Short.MIN_VALUE;
//        Long x7 = Long.MAX_VALUE;
//        Long x8 = Long.MIN_VALUE;
//        Float x9 = Float.MAX_VALUE;
//        Float x10 = Float.MIN_VALUE;
//        System.out.println(x1 + " - max Integer");
//        System.out.println(x2 + " - min Integer");
//        System.out.println(x3 + " - max Double");
//        System.out.println(x4 + " - min Double");
//        System.out.println(x5 + " - max Short");
//        System.out.println(x6 + " - miin Short");
//        System.out.println(x7 + " - max Long");
//        System.out.println(x8 + " - min Long");
//        System.out.println(x9 + " - max Float");
//        System.out.println(x10 + " - min Float");
//
//        double number =12345.3456;
//        System.out.println(Double.toString(number)+500);
//
//        Double z = 24.0*0.1;
//        System.out.println(z); //В шестнадцатом знаке после запятой появилась цифра 4.

    }
}