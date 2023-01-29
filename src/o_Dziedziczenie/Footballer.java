package o_Dziedziczenie;

public class Footballer extends Person {

    public String footballClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age);
        this.footballClub = footballClub;
    }

    public void playFootball() {
        System.out.println("I am playing football for " + footballClub);
    }
}
