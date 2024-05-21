import java.util.Scanner;

public class AnvandarSystem {
    private Scanner hanzo;
    private User anvandare;
    //anvandare, alltså user används då över hela koden
    private AdminUser adminAnvandare;

    public AnvandarSystem() {
        hanzo = new Scanner(System.in);
        anvandare = new User();
    }

    public void runUserSystem() {
        boolean running = true;
        //en boolean för att se till att programmet runnas

        while (running) {
            System.out.println("Välj ett alternativ:");
            System.out.println("1. Logga in\n2. Skapa konto\n3. Lämna webben\n");
            System.out.print("Ditt alternativ: ");
            int val = KorrektaFel.korrekta(hanzo.nextLine(), hanzo);
            //det ser till att valet du har är inte bokstäver utan endast nummer

            switch (val) {
                case 1:
                    LoggaUser.loggaIn(anvandare, hanzo);
                    break;
                    //använder sig av LoggaUser klassen
                case 2:
                    SkapaUser.skapaKonto(anvandare, hanzo);
                    break;
                    //använder sig av SkapaUser
                case 3:
                    System.out.println("Tack för att du använde vår tjänst. Hejdå!");
                    running = false;
                    break;
                    //case 3 gör då att booleanen blir false och då avslutas denna while loop
                default:
                    System.out.println("Felaktigt alternativ. Försök igen.\n");
                    //om valet är inte ett av alternativen
            }
        }
    }
}