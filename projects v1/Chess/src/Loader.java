public class Loader {

    public static void main(String[] args) {

        int sizeOfChess = 8;
        String baseCharr = "abcdefghijklmnopqrstuvwxyz";
        String sizeOfCharr = baseCharr.substring(0, sizeOfChess);
        int sizeI = sizeOfCharr.length();

        String[][] chess = new String[sizeI][sizeOfChess];

        for (int i = 0; i < sizeI; i++) {
            char simbolOfChess = baseCharr.charAt(i);
            for (int j = 0; j < sizeOfChess; j++) {
                int secondSimbolOfChess = j + 1;
                System.out.print(simbolOfChess);
                System.out.print(secondSimbolOfChess);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
