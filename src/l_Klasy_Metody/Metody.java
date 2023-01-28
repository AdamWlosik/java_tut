package l_Klasy_Metody;

public class Metody {

    public void policzWynik() { // void oznacza, ¿e metoda nie zwraca ¿adnej wartosci
        int results = 0;
        for ( int i =0; i < 100; i++) {
            results = results + i;
        }
        System.out.println("Rezultat to: " + results);
    }

    public int pobierzWynik() { // int oznacza, ¿e metoda zwraca inta
        int results = 0;
        for (int i = 0; i < 100; i++) {
            results = results + i;
        }
        return results;
    }
    public void policzWynikParam(int number) { // number podajemy w momencie wywo³ania metody
        int results = 0;
        for (int i = 0; i < number; i++) {
            results = results + i;
        }
        System.out.println("Rezultat z paramtrem " + number + " to: " + results);
    }

    public void add(int firstNumber, int secondNumber, String x) {
        System.out.println(x + (firstNumber + secondNumber));
    }

    public int addZwraca(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
