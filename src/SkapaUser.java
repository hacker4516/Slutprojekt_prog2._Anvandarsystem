public class SkapaUser { //detta ska användas för alternativ 2, genom att skapa konto i användar system kan man logga in som vanlig användare

    static void skapakonto(String UserNamn, String UserPass) {

        boolean SammaSom = false; //ifall användarnamn matchar med en annan i systemet

        for(int i = 0; User.NyName.length > i; i++) { //for loop kollar om användarnamnet finns, om det inte finns läggs till personen

            if (User.NyName[i] != null && User.NyName[i].equalsIgnoreCase(UserNamn)){ //kollar om användarenamnet finns, kan inte lägga till lösenord pga säkerhet!!
                System.out.println("\nDenna användare finns redan, försök igen via menyn!");
                SammaSom = true;
                break;
            }
        }
        if (!SammaSom){ //vad ! gör är att boolean blir alltid false, alltså SammaSom kommer att vara false och då funka

            for(int i = 0; User.NyName.length > i; i++){

                if(User.NyName[i] == null || User.NyName[i].equalsIgnoreCase("Okej")){
                    User.NyName[i] = UserNamn;
                    User.NyPass[i] = UserPass;
                    System.out.println("\nKonto skapad, tack att du stödjer oss\n");
                    break; //då blir användaren tillagd och nu kan man använda det för att logga in
                }
            }
        }
    }
}
