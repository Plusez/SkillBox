public class Loader {

    public static void main(String[] args) {

        int sizeI = 10;
        int sizeJ = 10;
        char[][] massivX = new char[sizeI][sizeJ];

        for (int i = 0; i < sizeI; i++) {
            for (int j = 0; j < sizeJ; j++) {
                if (i == j || j == sizeJ - 1 - i) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("\t");
        }

    }
}
