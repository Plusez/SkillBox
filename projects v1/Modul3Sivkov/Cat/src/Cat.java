
public class Cat {
    public static Integer count = 0;
    private Double originWeight;
    private Double weight;
    private Double minWeight;
    private Double maxWeight;
    private Double eatWeight;
    private Double firstWeight;
    private Double fromToilett;
    public static Integer getCount;
    public String getStatus;

    public static Integer countCat = 0;
    private Double originWeightCat;
    public Double weight2Cat;
    private Double minWeightCat;
    private Double maxWeightCat;
    private Double eatWeightCat;
    private Double firstWeightCat;
    private Double fromToilettCat;
//    public static Integer getCountCat;
    public String getStatusCat;


    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        firstWeight = weight;
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;
    }

    public Cat(Double weightCat) {
        weight2Cat = 100.0 + 100.0 * Math.random();
        firstWeight = weightCat;
        originWeight = weightCat;
        minWeight = 60.0;
        maxWeight = 290.0;
        count++;
    }
// Пример из урока
//    public static Double getWeightdifference (Cat cat1, Cat cat2)
//    {
//        Double getdifference = Math.abs(cat1.getWeight() - cat2.getWeight());
//        return getdifference;
//    }

    public void meow() {
        weight = weight - 1;
        System.out.println("Meow");
    }
// Пример из урока.
//    public void meow (Double weight)
//    {
//        this.weight = this.weight - weight;
//        System.out.println("Meow");
//    }

    public void feed(Double amount) {
        weight = weight + amount;
    }

    public void drink(Double amount) {
        weight = weight + amount;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getWeightCat() {
        return weight2Cat;

    }

    public Double eatWeight() {
        return eatWeight = weight - firstWeight;
    }

    public Double fromToilett() {
        return fromToilett = weight - 100;
    }

    public String getStatus() {
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    public Integer getCount() {
        if (getStatus().equals("Dead")) {
            count = count - 1;
        }
        if (getStatus().equals("Exploded")) {
            count = count - 1;
        }
        return count;
    }
}


