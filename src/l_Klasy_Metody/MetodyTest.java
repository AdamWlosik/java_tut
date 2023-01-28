package l_Klasy_Metody;

public class MetodyTest {
    public static void main(String[] args) {

        Metody test = new Metody();
        test.policzWynik();
        int results = test.pobierzWynik();
        System.out.println("Zwrocony wynik: " + results);
        test.policzWynikParam(5);
        test.policzWynikParam(10);

        test.add(2, 3, "Suma: ");
        System.out.println("Add zwraca: " + test.addZwraca(10, 3));

    }
}
