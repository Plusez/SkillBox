
public class Cat {
    private double originWeight;
    private double weight;

    public static final double MIN_WEIGHT = 1000.0;
    public static final double MAX_WEIGHT = 9000.0;
    public static final int QUANTITY_EYES = 2;

    public double feedCat;
    public double drinkCat;
    public static int count;
    public String name;
    public CatsColor color;


    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        feedCat = 0.0;
        count++;
        setCatsColor(CatsColor.BLACK_COLOR);
    }

    public Cat clone() {
        Cat cat = new Cat();
        if (cat.getStatus().equals("Playing") || getStatus().equals("Sleeping")) {
            this.weight = cat.getWeight();
            this.originWeight = cat.originWeight;
            this.feedCat = 0.0;
            this.color = cat.getCatsColor();
            return cat;
        } else {
            System.out.println("Эта модель не готова");
            return null;
        }
    }

    public Cat(String name) {
        this();
        this.name = name;
    }

    public void setCatsColor(CatsColor color) {
        this.color = color;
    }

    public CatsColor getCatsColor() {
        return color;
    }

    public static int getCount() {
        return count;
    }

    public void goToToilet() {
        weight = weight - 100 * Math.random();
        if (weight >= MIN_WEIGHT) {
            System.out.println("Ура!");
        } else {
            count--;
            System.out.println("минус одна кошка");
        }
    }

    public void meow() {
        if (getStatus().equals("Playing") || getStatus().equals("Sleeping")) {
            weight = weight - 1;
            System.out.println("Meow");
            if (weight < MIN_WEIGHT) {
                count--;
                System.out.println("минус одна кошка");
            }
        }
    }

    public void feed(double amount) {
        if (getStatus().equals("Playing") || getStatus().equals("Sleeping")) {
            weight += amount;
            feedCat += amount;
            System.out.println("Поел");
            if (weight > MAX_WEIGHT) {
                count--;
                System.out.println("минус одна кошка");
            }
        }
    }

    public void drink(double amount) {
        if (getStatus().equals("Playing") || getStatus().equals("Sleeping")) {
            weight += amount;
            drinkCat += amount;
            System.out.println("Попил");
            if (weight > MAX_WEIGHT) {
                count--;
                System.out.println("минус одна кошка");
            }
        }
        weight = weight + amount;
    }

    public Double getWeight() {
        return weight;
    }

    public String getStatus() {
        if (weight < MIN_WEIGHT) {
            return "Dead";
        } else if (weight > MAX_WEIGHT) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }
}