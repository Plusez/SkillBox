
public class Loader {
    public static void main(String[] args) {
        int dimaAge = 1;
        int mishaAge = 1;
        int vasyaAge = 15;
        int summ = dimaAge + mishaAge + vasyaAge;
        int oldest;
        int youngest;
        int middle;


        if (mishaAge >= dimaAge && mishaAge >= vasyaAge) {
            oldest = mishaAge;
        } else if (dimaAge >= mishaAge && dimaAge >= vasyaAge) {
            oldest = dimaAge;
        } else {
            oldest = vasyaAge;
        }
        System.out.println("Most old: " + oldest);
        int summTwoMen = summ - oldest;

        if (mishaAge <= dimaAge && mishaAge <= vasyaAge) {
            youngest = mishaAge;
        } else if (dimaAge <= mishaAge && dimaAge <= vasyaAge) {
            youngest = dimaAge;
        } else {
            youngest = vasyaAge;
        }
        System.out.println("Most young: " + youngest);
        int summOneMen = summTwoMen - youngest;

        System.out.println("Middle: " + summOneMen);
    }
}

