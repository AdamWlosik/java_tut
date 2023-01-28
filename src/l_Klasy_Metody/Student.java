package l_Klasy_Metody;

public class Student {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;

    public void przedstawSie() {
        System.out.println("Nazywam sie " + imie +" " + nazwisko);
    }

    public void zalogujSie() {
        System.out.println("Loguje sie za pomoco nicku: " + nick);
    }

    public void podajNumerIndeksu() {
        System.out.println("Moj numer indeksu to: " + numerIndeksu);
    }

    public void podajEmial() {
        System.out.println("Moj emial to: " + email);
    }
}
