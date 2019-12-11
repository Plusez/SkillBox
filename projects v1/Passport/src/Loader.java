public class Loader {

    public static void main(String[] args) {

        int startYear = 1997;
        int currentYear = 2019;
        int quantityYears = currentYear - startYear + 1;
        int quantityRegions = 89;

        int [][] numberOfPassport = new int [quantityRegions][quantityYears];
        int numericRegionNumber;
        int numericYearNumber;
        for (numericRegionNumber = 1; numericRegionNumber < quantityRegions + 1; numericRegionNumber++) {
            for (numericYearNumber = startYear; numericYearNumber < currentYear + 1; numericYearNumber++) {
                //String numberRegion = numericRegionNumber.toString(numericRegionNumber);
                String numberRegion = String.valueOf(numericRegionNumber);
                //String numberYear = numericYearNumber.toString().substring(2);
                String numberYear = String.valueOf(numericYearNumber).substring(2);
                String yearAndNumber = numberRegion.concat(numberYear);
                Integer passportSeries = Integer.valueOf(yearAndNumber);
                System.out.printf("%04d\t", passportSeries);

            }
            System.out.println();
        }
    }
}
