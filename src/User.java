import java.util.ArrayList;

public class User { //detta ska användas för att samla in alla skapade och existerande användare

    private ArrayList<String> nyNamn;
    private ArrayList<String> nyPass;

    public User() {
        nyNamn = new ArrayList<>();
        nyPass = new ArrayList<>();
    }
    //skapar arraylist för namn och koder inom systemet, vilket sedan förs över till SkapaUser osv

    public ArrayList<String> getNyNamn() {
        return nyNamn;
    }

    public ArrayList<String> getNyPass() {
        return nyPass;
    }
    //getter för att få namnen samt koderna vilket används senare också med att logga in
    public void addUser(String userNamn, String userPass) {
        nyNamn.add(userNamn);
        nyPass.add(userPass);
    }
    //de här gör det möjligt att lägga till användaren
}