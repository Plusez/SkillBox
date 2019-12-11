import java.util.Scanner;

public class Loader {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер телефона: ");
        String phoneNumber = sc.next();
        phoneNumber = phoneNumber.replaceAll("[^0-9]+", "");
        System.out.println(phoneNumber);
//        AuthSentCode authSendCode = bridge.authSendCode(phoneNumber);
    }
}
