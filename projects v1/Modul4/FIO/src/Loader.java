import java.util.Scanner;

public class Loader {

    public static void main(String[] args) {

        System.out.print("Введите Фамилию Имя Отчество: ");
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();
        String [] name = fullName.split("\\s");
        System.out.println("Фамилия: " + name[0]);
        System.out.println("Имя: " + name[1]);
        System.out.println("Отчество: " + name[2]);

    }

}
