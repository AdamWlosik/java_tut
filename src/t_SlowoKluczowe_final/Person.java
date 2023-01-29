package t_SlowoKluczowe_final;

// public final class Preson {} nie mo�na dziedziczy� z takiej klasy
public class Person {

    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public final void eat() {
        System.out.println("eat z classy g��wnej");
    }

    public void walk() {
        System.out.println("walk z classy g��wnej");
    }
}
