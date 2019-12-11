import org.javagram.TelegramApiBridge;
import org.javagram.response.AuthAuthorization;
import org.javagram.response.AuthCheckedPhone;
import org.javagram.response.AuthSentCode;
import org.javagram.response.object.User;
import org.javagram.response.object.UserContact;
import org.telegram.api.auth.TLAuthorization;
import org.telegram.api.auth.TLSentCode;
import org.telegram.api.requests.TLRequestAccountUpdateStatus;
import org.telegram.api.requests.TLRequestAuthSendCode;
import org.telegram.tl.TLBoolTrue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import org.javagram.response.object.User;

public class Loader {


    public static void main(String[] args) throws IOException {

        TelegramApiBridge bridge = new TelegramApiBridge("149.154.167.50:443", 627636, "750aede6af39af5e831683fc121fbfb7");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер телефона: ");
        String phoneNumber = sc.next();
        phoneNumber = phoneNumber.replaceAll("\\D+", "");
        System.out.println(phoneNumber);
        AuthSentCode authSendCode = bridge.authSendCode(phoneNumber);

        System.out.println("код подтверждения: " + authSendCode);

        Scanner scc = new Scanner(System.in);
        System.out.println("Введите полученный код подтверждения: ");
        String smsCode = scc.next();
        AuthAuthorization authSignIn = bridge.authSignIn(smsCode);

        User getUser1 = authSignIn.getUser();


        System.out.println("Вы авторизованы: " + getUser1);

        ArrayList<UserContact> contactsGetContacts = bridge.contactsGetContacts();
        System.out.println(contactsGetContacts);
    }
}
