import java.util.ArrayList;
import java.util.Arrays;

public class User { //detta ska användas för att samla in alla skapade och existerande användare

    static String[] NyName = new String[59];
    static String[] NyPass = new String [59];

    static String[] AdminName = new String[2];
    static String[] AdminPass = new String[2];
    public User(){ //för alternativ 2, alltså logga in med användarnamn och kod

        Arrays.fill(NyName, "Okej");
        Arrays.fill(NyPass, "");

    }
}
