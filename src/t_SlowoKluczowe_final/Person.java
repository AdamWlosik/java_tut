package t_SlowoKluczowe_final;

// public final class Preson {} nie mo¿na dziedziczyæ z takiej klasy
public class Person {

    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public final void eat() {
        System.out.println("eat z classy g³ównej");
    }

    public void walk() {
        System.out.println("walk z classy g³ównej");
    }
}
