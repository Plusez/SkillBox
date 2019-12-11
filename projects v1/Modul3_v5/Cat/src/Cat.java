
public class Cat implements Cloneable {
    public static Integer count = 0;
    public Double weight;
    public Double minWeight;
    public Double maxWeight;
    public Double firstWeight;

    public int eatWeight;


    public Cat() {
        this(1500.0 + 3000.0 * Math.random());
    }

    public Cat (Double weight) {
        this.weight = weight;
        firstWeight = this.weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count ++;
    }

    public Cat clone () {
        Cat cat = new Cat();
        this.weight = cat.getWeight();
        return cat;
    }


// Пример из урока
//    public static Double getWeightdifference (Cat cat1, Cat cat2)
//    {
//        Double getdifference = Math.abs(cat1.getWeight() - cat2.getWeight());
//        return getdifference;
//    }

//    public void createTwin() {
//        this.weight =
//    }
//    public void meow() {
//        weight = weight - 1;
//        System.out.println("Meow");
//        if (weight < minWeight) {
//            count--;
//        }
//    }

// Пример из урока.
//    public void meow (Double weight)
//    {
//        this.weight = this.weight - weight;
//        System.out.println("Meow");
//    }

    public void feed(Double amount) {
        weight += amount;
        eatWeight += amount;
        //eatWeight = amount - weight;
        if (weight > maxWeight) {
            count--;
        }
    }

    public void drink(Double amount) {
        weight = weight + amount;
        if (weight > maxWeight) {
            count--;
        }
    }

    public void setWeight(Double weight) {
        this.weight = weight;
        this.firstWeight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getWeightCat() {
        return weight;
    }

    public Integer eatWeight() {
        return eatWeight;
    }

    public Double fromToilett() {
        //return weight - 100;
        if (weight < minWeight) {
            count--;
        }
        return weight - 100;
    }

    public String getStatus() {
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        } else if (weight > firstWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

}


