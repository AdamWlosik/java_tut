package r_ModyfikatoryDostepu.second;

import r_ModyfikatoryDostepu.first.Parent;

public class Child extends Parent {

    // klasa potomna w innej paczce nie ma dostêpu do pól/metod private oraz default czyli bez indetyfikatora
    public void testIdentifiresChild() {
        System.out.println(first);
        //System.out.println(second);
        System.out.println(third);
        //System.out.println(fourth);
        firstMethod();
        //secondMethod();
        thirdMethod();
        //fourthMethod();
    }
}
