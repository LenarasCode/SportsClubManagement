public class Main {
    public static void main(String[] args) {
        Sport football = new Sport("Футбол", 11);
        Sport basketball = new Sport("Баскетбол", 5);

        Athlete athlete1 = new Athlete("Иван Иванов", 25, "Футбол");
        Athlete athlete2 = new Athlete("Мария Смирнова", 22, "Баскетбол");

        SportsClub club = new SportsClub("Элитный Спортивный Клуб", "Алматы");

        football.displaySportInfo();
        basketball.displaySportInfo();
        athlete1.displayAthleteInfo();
        athlete2.displayAthleteInfo();
        club.displayClubInfo();

        if (athlete1.getAge() > athlete2.getAge()) {
            System.out.println(athlete1.getName() + " старше, чем " + athlete2.getName());
        } else {
            System.out.println(athlete2.getName() + " старше, чем " + athlete1.getName());
        }
    }
}

