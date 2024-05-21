import java.util.ArrayList;
import java.util.Scanner;


public class LoggaUser { //används för att logga in, förstod inte varför det inte funkade i AnvandarSystem som SkapaUser gjorde
//vad LoggaUser ger möjligheten till är att användaren kan sedan utföra olika saker, som till exempel köpa något osv
    //användare med admins roll kan även se hur många användare det finns samt namnen, och har möjligheten att ta bort användare också (egenskaper)
    public static void loggaIn(User anvandare, Scanner hanzo) {
        System.out.print("Ditt användarnamn: ");
        String userNamn = hanzo.nextLine();
        System.out.print("Ditt lösenord: ");
        String userPass = hanzo.nextLine();

        ArrayList<String> nyNamnList = anvandare.getNyNamn();
        ArrayList<String> nyPassList = anvandare.getNyPass();
        //getter från User klassen som gör så att systemet får in redan skapade användare

        boolean loggadIn = false;
        boolean loggadAdmin = false;
        for (int i = 0; i < nyNamnList.size(); i++) {
            if (nyNamnList.get(i).equalsIgnoreCase(userNamn) && nyPassList.get(i).equals(userPass)) {
                loggadIn = true;
                if (userNamn.equalsIgnoreCase("Stor") && userPass.equals("pojke")) {
                    loggadAdmin = true;
                }
                break;
            }
        }
        //en for loop som kollar ifall namnet och koden stämmer med det som redan finns
        //loggar in dig om det stämmer

        if (loggadIn) {
            System.out.println("Loggad in");
            //här är det möjligt att lägga till en UI till logga in featuren (displayUI(blah blah))
            //när du är loggad in, kommer det att displaya en ui, likt användar system switch delen
            //som exempel kan du visa profil, köpa något, byta lösenord, eller logga ut
            if (loggadAdmin) {
                System.out.println("Välkommen Admin!");
            } else {
                System.out.println("Välkommen!");
            }
        } else {
            System.out.println("Felaktigt användarnamn eller lösenord!");
        }
    }
}