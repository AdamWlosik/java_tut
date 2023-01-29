package n_PolaStatyczne_MetodyStatyczne;

public class StudentStatyczne {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;
    public static String nazwaUczelni = "AGH";  // pole wsp�lne wszystkich obiekt�w

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

    public static void infoUczelnia() {
        System.out.println("Moja uczelnia to: " + nazwaUczelni); // mo�na si� odwo�ywac tylko do p�l statycznych
        // System.out.println(imie); nie zadzia�a bo imie nie jest statyczne
        druga(); //wewn�trze metody statycznej mo�na wywo�a� inn� metod� statyczna
    }

    public static void druga() {
        System.out.println("jestem druga metoda");
    }
}
