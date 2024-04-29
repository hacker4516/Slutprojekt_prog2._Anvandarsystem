import java.util.Scanner;

public class LoggaUser { //används för att logga in, förstod inte varför det inte funkade i AnvandarSystem som SkapaUser gjorde
//vad LoggaUser ger möjligheten till är att användaren kan sedan utföra olika saker, som till exempel köpa något osv
    //användare med admins roll kan även se hur många användare det finns samt namnen, och har möjligheten att ta bort användare också (egenskaper)
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
