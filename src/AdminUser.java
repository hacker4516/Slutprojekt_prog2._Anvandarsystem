class AdminUser extends User{

    private String AdminNamn;
    private String AdminPass;
    public AdminUser(){ //denna används för att se ifall användaren är en admin med permissions i system
        //admin users kommer att redan finnas i systemet, vanliga users skapas i förhand
        //likt VanligaUser klassen, så används detta för att visa vad admins kan göra efter de har loggat in
        //en admin UI här kan göra så att du kan implementera flera roller som mod




    }
}
