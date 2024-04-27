import java.util.Scanner;

public class AnvandarSystem {
    static public Scanner hanzo = new Scanner(System.in);

    static String korektion;
    public AnvandarSystem(){ //för att lägga till i main


        System.out.println("Hej\n\nVälj ett alternativ: ");
        System.out.println("1. Logga in\n2. Skapa konto\n3. Lämna webben");
        System.out.print("Ditt alternativ: ");
        korektion = hanzo.nextLine();
        //dessa är alternativ du får i början vilket bestämmer vad du vill göra i webbsidan, vilket kan vara vad som helst

            if (korektion.equals("1")) {
                new User();
            }
        }
    }