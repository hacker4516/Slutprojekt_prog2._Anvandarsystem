import java.util.ArrayList;
import java.util.Scanner;

public class SkapaUser {
    public static void skapaKonto(User anvandare, Scanner hanzo) {
        System.out.print("Välj användarnamn: ");
        String userNamn = hanzo.nextLine();
        System.out.print("Välj lösenord: ");
        String userPass = hanzo.nextLine();

        ArrayList<String> nyNameList = anvandare.getNyNamn();
        ArrayList<String> nyPassList = anvandare.getNyPass();
        //getter igen som tidigare

        boolean userFinns = false;
        for (String existerandeUser : nyNameList) {
            if (existerandeUser.equalsIgnoreCase(userNamn)) {
                System.out.println("\nAnvändarnamnet finns redan! Försök gärna igen");
                userFinns = true;
                break;
            }
        }
        //denna kollar ifall användarnamnet själv finns med i systemet
        //kan inte kolla med kod eftersom varför ska man kunna se en annan persons kod, säkerhet!
        if (!userFinns) {
            anvandare.addUser(userNamn, userPass);
            System.out.println("\nKonto skapat.\n");
            //vad ! gör är att boolean blir alltid false, alltså userFinns kommer att vara false och då funka
        }
    }
}