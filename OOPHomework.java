public class Main {
    public static void main(String[] args) {
        // Create Sports
        Sport football = new Sport("Football", 90);
        Sport basketball = new Sport("Basketball", 40);

        // Create Athletes
        Athlete athlete1 = new Athlete("John Doe", 25, "Football");
        Athlete athlete2 = new Athlete("Jane Smith", 22, "Basketball");

        // Create Sports Club
        SportsClub club = new SportsClub("Elite Sports Club", "Downtown City");

        // Output to Console
        System.out.println(football);
        System.out.println(basketball);
        System.out.println(athlete1);
        System.out.println(athlete2);
        System.out.println(club);

        // Compare Objects
        System.out.println("Are both sports the same? " + football.getName().equals(basketball.getName()));
    }
}
