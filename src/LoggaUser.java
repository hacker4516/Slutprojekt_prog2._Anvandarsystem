public class LoggaUser { //används för att logga in, förstod inte varför det inte funkade i AnvandarSystem som SkapaUser gjorde
//vad LoggaUser ger möjligheten till är att användaren kan sedan utföra olika saker, som till exempel köpa något osv
    //användare med admins roll kan även se hur många användare det finns samt namnen, och har möjligheten att ta bort användare också (egenskaper)

    static boolean loggadIn; //för att se ifall användarnamnet och lösenordet stämmer med det som redan finns i systemet

    public static void LoggaIn() {
        System.out.print("Ditt användarnamn: ");
        String userNamn = AnvandarSystem.hanzo.nextLine();
        System.out.print("Ditt lösenord: ");
        String userPass = AnvandarSystem.hanzo.nextLine();

        for (int i = 0; i < User.getNyName().size(); i++) {
            if (User.getNyName().get(i) != null && user.getNyName().get(i).equalsIgnoreCase(userNamn)
                    && user.getNyPass().get(i).equals(userPass)) {
                loggadIn = true;
                System.out.println("Du är nu loggad in");
            }
        }

        System.out.println("Fel användarnamn eller lösenord.");

    }
}
