public class SportsClub {
    private String clubName;
    private String location;

    public SportsClub(String clubName, String location) {
        this.clubName = clubName;
        this.location = location;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void displayClubInfo() {
        System.out.println("Клуб: " + clubName + ", Местоположение: " + location);
    }
}
