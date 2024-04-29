import java.util.ArrayList;
import java.util.Scanner;

public class AnvandarSystem {
    static public Scanner hanzo = new Scanner(System.in); //min scanner jag använder i alla klasser

    static ArrayList<VanligaUser> vanlig = new ArrayList<>(); //de här är en arraylist för alla vanliga användare

    static ArrayList<AdminUser> Admin = new ArrayList<>(); //de här är en arraylist för alla admins
    static String val; //ditt val i början
    static int kaffe; //denna används för att se till ifall ditt val för ett av alternativen faktiskt stämmer och är nummer
    public AnvandarSystem(){ //för att lägga till i main

        boolean fortsatt = true;

        while(fortsatt) { //med boolean och while loop gör det möjligt att programmet inte avslutas efter ett konto har skapats
        System.out.println("Välj ett alternativ:");
        System.out.println("1. Logga in\n2. Skapa konto\n3. Lämna webben\n");
        System.out.print("Ditt alternativ: ");
        val = hanzo.nextLine();
        //dessa är alternativ du får i början vilket bestämmer vad du vill göra i webbsidan, vilket kan vara vad som helst (webbsidan)
        kaffe = korrektafel.korrekta(val);

        switch (kaffe) { //med hjälp av switch kan vi ta cases, alltså alternativen, case är då din input
            case 1 -> LoggaUser.loggain(); //använder klassen LoggaUser för att logga in
            case 2 -> {
                System.out.print("Välj användarnamn: ");
                String userName = hanzo.nextLine();
                System.out.print("Välj lösenord: ");
                String userPass = hanzo.nextLine();
                SkapaUser.skapakonto(userName, userPass); //här skapas nya kontot, i koppling med klassen SkapaUser
                System.out.println("\n");

                Main.main(null); //programmet körs igen fast med nya kontot/n
            }
            case 3 -> System.exit(0); //avslutar ba programmet
            default -> System.out.println("Alternativen är mellan 1, 2 eller 3!\n");
        }
    }
}}