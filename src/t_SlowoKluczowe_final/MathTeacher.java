package t_SlowoKluczowe_final;

import o_Dziedziczenie_SlowoKluczowe_super.Person;

public class MathTeacher extends Person {

    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public void walk() {
        super.walk(); // wywo�anie walk z klasy nadrz�dnej za pomoc� super
        System.out.println("nadpisana metoda walk w klasie podrzednej");
    }

    public void teachMath() {
        System.out.println("I am teaching math at the " + school);
    }

    public void sayHello() {
        System.out.println("Hello my name is " + name);
        System.out.println("I am " + age);
    }
}
