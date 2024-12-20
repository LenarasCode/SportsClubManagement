public class Athlete {
    private String name;
    private int age;
    private String sport;

    public Athlete(String name, int age, String sport) {
        this.name = name;
        this.age = age;
        this.sport = sport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public void displayAthleteInfo() {
        System.out.println("Атлет: " + name + ", Возраст: " + age + ", Вид спорта: " + sport);
    }
}
