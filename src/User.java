import java.util.ArrayList;

public class User { //detta ska användas för att samla in alla skapade och existerande användare

    private ArrayList<String> nyName = new ArrayList<>();
    private ArrayList<String> nyPass = new ArrayList<>();
    private ArrayList<String> adminName = new ArrayList<>();
    private ArrayList<String> adminPass = new ArrayList<>();
    public User(){ //för alternativ 2, alltså logga in med användarnamn och kod

        for (int i = 0; i < 59; i++) {
            nyName.add("Okej");
        }
        for (int i = 0; i < 59; i++) {
            nyPass.add("");
        }
        for (int i = 0; i < 2; i++) {
            adminName.add("");
        }
        for (int i = 0; i < 2; i++) {
            adminPass.add("");
        }
    }
    public ArrayList<String> getNyName() {
        return nyName;
    }
    public ArrayList<String> getNyPass() {
        return nyPass;
    } //dessa två arraylists är getters som gör det möjligt att använda sig av stringen i flera klasser, som t.ex. SkapaUser
}
