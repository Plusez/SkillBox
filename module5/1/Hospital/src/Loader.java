public class Loader {

    public static void main(String[] args) {

        double[] tempOfPac = new double[30];

        double sumTemperature = 0.0;
        int quanOfHealth = 0;
        for (int i = 0; i < tempOfPac.length; i++) {
            tempOfPac[i] = 32 + 8 * Math.random();
            sumTemperature += tempOfPac[i];
            System.out.println(i + " - " + tempOfPac[i]);
            if (36.2 <= tempOfPac[i] && tempOfPac[i] <= 36.9) {
                quanOfHealth += 1;
            }
        }
        double midTemp = sumTemperature / tempOfPac.length;
        System.out.println("средняя температура - " + midTemp);
        System.out.println("количество здоровых - " + quanOfHealth);
    }
}
