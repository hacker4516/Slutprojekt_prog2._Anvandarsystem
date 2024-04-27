import java.text.NumberFormat;
import java.util.Scanner;

public class korrektafel { //detta ska användas för att se till ifall ditt val av alternativ är ett nummer och ett av alternativen, try catch

    public static int korrektafel(String korektion){

        while(true){
            try{
                return Integer.parseInt(korektion);
            }
            catch (NumberFormatException e){
                System.out.println(korektion + " är inte ett av alternativen, vänligen försök igen.");
            }
            System.out.print("Skriv 1, 2 eller 3, endast nummer: ");
            korektion = AnvandarSystem.hanzo.nextLine();
        }

    }
}
