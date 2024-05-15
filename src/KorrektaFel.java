import java.util.Scanner;


public class KorrektaFel { //detta ska användas för att se till ifall ditt val av alternativ är ett nummer och ett av alternativen

    public static int korrekta(String val, Scanner hanzo){

        while(true){ //en while loop
            try{
                return Integer.parseInt(val);
            }
            catch (NumberFormatException e){
                System.out.println(val + " är inte ett av alternativen, vänligen försök igen och används endast nummer\n");
            } //den ändrar stringen till en integer och förstår att det inte är ett nummer, vilket funkar med en try-catch
            System.out.print("Ditt val:");
            val = hanzo.nextLine(); //du gör om ditt val
        }
    }
}
