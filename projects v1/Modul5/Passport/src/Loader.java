public class Loader {

    public static void main(String[] args) {

        Integer startYear = 1997;
        Integer currentYear = 2019;
        Integer i;
        Integer j;


        Integer [][] numberOfPassport = new Integer [89][23];

        for (i = 1; i < 90; i++) {
            for (j = startYear; j < currentYear +1; j++) {
                String ii = i.toString(i);
                String jj = j.toString().substring(2);
                String yearAndNumber = ii.concat(jj);
                Integer n = Integer.valueOf(yearAndNumber);
//                numberOfPassport[i][j] = n;
                System.out.printf("%04d\t", n);

            }
        System.out.println();
        }
    }
}
