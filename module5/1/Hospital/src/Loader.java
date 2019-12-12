public class Loader {

    static final double MIN_TEMP = 32.0;
    static final double MAX_TEMP = 40.0;
    static final double MIN_HEALTHY_TEMP = 36.2;
    static final double MAX_HEALTHY_TEMP = 36.9;

    public static void main(String[] args) {

        double[] tempOfPac = new double[30];

        double sumTemperature = 0.0;
        int quanOfHealthy = 0;
        for (int i = 0; i < tempOfPac.length; i++) {
            tempOfPac[i] = MIN_TEMP + 8 * Math.random(); // MIN_TEMP <= tempOfPac <= MAX_TEMP
            sumTemperature += tempOfPac[i];
            System.out.printf(i + " - %.2f %n", tempOfPac[i]);
            if (MIN_HEALTHY_TEMP <= tempOfPac[i] && tempOfPac[i] <= MAX_HEALTHY_TEMP) {
                quanOfHealthy += 1;
            }
        }
        double midTemp = sumTemperature / tempOfPac.length;
        System.out.printf("средняя температура - %.2f %n", midTemp);
        System.out.println("количество здоровых - " + quanOfHealthy);
    }
}
