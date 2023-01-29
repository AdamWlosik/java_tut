package o_Dziedziczenie_SlowoKluczowe_super;

public class Footballer extends Person {

    public String footballClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age);
        this.footballClub = footballClub;
    }

    public void eat() { // metoda eat nadpisana jeœli bêdziemy wywo³ywaæ eat wyœwietli siê eat z klasy podrzêdnej czyli ta
        System.out.println("nadpisana medota eat w klasie podrzednej");
    }

    public void playFootball() {
        System.out.println("I am playing football for " + footballClub);
    }
}
