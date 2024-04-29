public class LoggaUser { //används för att logga in, förstod inte varför det inte funkade i AnvandarSystem som SkapaUser gjorde
//vad LoggaUser ger möjligheten till är att användaren kan sedan utföra olika saker, som till exempel köpa något osv
    //användare med admins roll kan även se hur många användare det finns samt namnen, och har möjligheten att ta bort användare också (egenskaper)
    String userNamn;
    String userPass;
    static boolean loggadin;

    public static void loggain() {
        System.out.print("Ditt användarnamn: ");
        userNamn = AnvandarSystem.hanzo.nextLine();
        System.out.print("Ditt lösenord: ");
        userPass = AnvandarSystem.hanzo.nextLine();




        loggadin = true;
    }
}
