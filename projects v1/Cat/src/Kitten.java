public class Kitten {

    private Double weight;
    private Double minWeight;
    private Double maxWeight;
    private Double originWeight;
    public static Integer count = 0;


    public Kitten(){
        weight = 100.0 + 100.0*Math.random();
        originWeight = weight;
        minWeight = 90.0;
        maxWeight = 250.0;
        count++;
    }

    public Double getWeight() {
        return weight;
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
