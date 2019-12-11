public class Loader {

    public static void main (String[] args)

    {
        Integer moneyAmount = 20000;
        Boolean hasPreviousVisa = true;
        Boolean hasConviction = false;

        if ((moneyAmount > 45000 || hasPreviousVisa) && !hasConviction) {
            System.out.println( "Visa should be granted");
        } else {
            System.out.println( "Visa cannot be granted");
        }

    }
}