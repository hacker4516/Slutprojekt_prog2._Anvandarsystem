import java.util.ArrayList;

public class SkapaUser { //detta ska användas för alternativ 2, genom att skapa konto i användar system kan man logga in som vanlig användare
    static boolean SammaSom = false; //ifall användarnamn matchar med en annan i systemet

    static void skapakonto(String userNamn, String userPass) {


        User anvandare = new User(); //gör det möjligt att skapa en ny användare utan att den blir public

        ArrayList<String> nyNameList = anvandare.getNyName();
        ArrayList<String> nyPassList = anvandare.getNyPass(); //kopplas string arraylisten från User klassen


        for (int i = 0; i < nyNameList.size(); i++) { //for loop kollar om användarnamnet finns, om det inte finns läggs till personen

            if (nyNameList.get(i) != null && nyNameList.get(i).equalsIgnoreCase(userNamn)) { //kollar om användarenamnet finns, kan inte lägga till lösenord pga säkerhet!!
                System.out.println("\nDenna användare finns redan, försök igen via menyn!");
                SammaSom = true;
                break;
            }
        }
        if (!SammaSom){ //vad ! gör är att boolean blir alltid false, alltså SammaSom kommer att vara false och då funka

            for (int i = 0; i < nyNameList.size(); i++) {
                if (nyNameList.get(i) == null || nyNameList.get(i).equalsIgnoreCase("Okej")) {
                    nyNameList.set(i, userNamn);
                    nyPassList.set(i, userPass);
                    System.out.println("\nKonto skapad, tack att du stödjer oss\n");
                    break;
                }
            }
        }
    }
}