package o_Dziedziczenie_SlowoKluczowe_super;

public class PersonTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 27, "University");
        //teacher.sayHello();
        teacher.walk();
        teacher.eat();
        //teacher.teachMath();

        Footballer footballer = new Footballer("Mike", 21, "ManchesterUnited");
        footballer.walk();
        footballer.eat();
        ///footballer.playFootball();
    }
}
