package t_SlowoKluczowe_final;

import o_Dziedziczenie_SlowoKluczowe_super.Person;

public class FinalTest {
    public static void main(String[] args) {
        final int x = 2;
        // x = 5 s�owo kluczowe final uniemo�liwa zmiane warto�ci zmiennje

        final Person person = new Person("Tim", 26);
        person.age = 25;
        // mo�emy edytowa� istniej�ce zmienne/ metody nie mo�emy przypisac nowej

        // person = new Person("Tom", 22);

    }
}
