package t_SlowoKluczowe_final;


public class Footballer extends Person {

    public String footballClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age);
        this.footballClub = footballClub;
    }
    // nie mo¿emy nadpisaæ metody, która w klasie rodzica jest oznaczona final
    /*public void eat() {
        System.out.println("nadpisana medota eat w klasie podrzednej");
    }*/

    public void playFootball() {
        System.out.println("I am playing football for " + footballClub);
    }
}
