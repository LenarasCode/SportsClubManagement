public class Sport {
    private String name;
    private int playersRequired;

    public Sport(String name, int playersRequired) {
        this.name = name;
        this.playersRequired = playersRequired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayersRequired() {
        return playersRequired;
    }

    public void setPlayersRequired(int playersRequired) {
        this.playersRequired = playersRequired;
    }

    public void displaySportInfo() {
        System.out.println("Вид спорта: " + name + ", Требуемое количество игроков: " + playersRequired);
    }
}
