import java.util.Scanner;

public class korrektafel { //detta ska användas för att se till ifall ditt val av alternativ är ett nummer och ett av alternativen, try catch

    public static int korrekta(String val){

        while(true){
            try{
                return Integer.parseInt(val);
            }
            catch (NumberFormatException e){
                System.out.println(val + " är inte ett av alternativen, vänligen försök igen och används endast nummer\n");
            }
            System.out.print("Ditt val:");
            val = AnvandarSystem.hanzo.nextLine();
        }
    }
}
