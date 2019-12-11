
public class Cat {
    private double originWeight;
    private double weight;

    public static final double MIN_WEIGHT = 1000.0;
    public static final double MAX_WEIGHT = 9000.0;
    public static final int QUANTITY_EYES = 2;

    public static int massOfEat;
    public static int count;
    public String name;
    public CatsColor color;


    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        count++;
        setCatsColor(CatsColor.BLACK_COLOR);
    }

    public Cat clone() {
        Cat cat = new Cat();
        this.weight = cat.getWeight();
        this.originWeight = cat.originWeight;
        this.color = cat.getCatsColor();
        return cat;
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

    public void eat() {
        weight = weight + massOfEat;
    }

    public static double getMassOfEat() {
        return massOfEat;
    }

    public String GoToToilet() {
        weight = weight - 100 * Math.random();
        return "Ура!";
    }

    public void meow() {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount) {
        weight = weight + amount;
    }

    public void drink(Double amount) {
        weight = weight + amount;
    }

    public Double getWeight() {
        return weight;
    }

    public String getStatus() {
        if (weight < MIN_WEIGHT) {
            count--;
            return "Dead";
        } else if (weight > MAX_WEIGHT) {
            count--;
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }
}