
public class Loader {
    public static void main(String[] args) {
        Integer dimaAge = 35;
        Integer mishaAge = 55;
        Integer vasyaAge = 15;
        Integer oldest;
        Integer youngest;
        Integer middle;


        if (mishaAge > dimaAge && mishaAge > vasyaAge) {
            oldest = mishaAge;
        } else if (dimaAge > mishaAge && dimaAge > vasyaAge) {
            oldest = dimaAge;
        } else {
            oldest = vasyaAge;
        }
        System.out.println("Most old: " + oldest);

        if (mishaAge < dimaAge && mishaAge < vasyaAge) {
            youngest = mishaAge;
        } else if (dimaAge < mishaAge && dimaAge < vasyaAge) {
            youngest = dimaAge;
        } else {
            youngest = vasyaAge;
        }
        System.out.println("Most young: " + youngest);

        if (oldest > mishaAge && mishaAge > youngest) {
            middle = mishaAge;
        } else if (oldest > dimaAge && dimaAge > youngest) {
            middle = dimaAge;
        } else {
            middle = vasyaAge;
        }
        System.out.println("Middle: " + middle);
    }
}

