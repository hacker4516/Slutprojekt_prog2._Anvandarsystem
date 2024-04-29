import java.util.Scanner;

public class LoggaUser { //används för att logga in, förstod inte varför det inte funkade i AnvandarSystem som SkapaUser gjorde

    static String UserNamn;
    static String UserPass;
    static boolean loggadin;

    public static void loggain() {
        System.out.print("Ditt användarnamn: ");
        UserNamn = AnvandarSystem.hanzo.nextLine();
        System.out.print("Ditt lösenord: ");
        UserPass = AnvandarSystem.hanzo.nextLine();

        loggadin = true;
    }
}
