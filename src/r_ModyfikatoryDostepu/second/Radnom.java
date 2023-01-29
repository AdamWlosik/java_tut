package r_ModyfikatoryDostepu.second;

import r_ModyfikatoryDostepu.first.Parent;

public class Radnom {

    public void testIdentifiresRandom() {

        // klasa w innej paczce nie ma dostêpu do pól/metod private oraz default czyli bez indetyfikatora
        // oraz protected

        Parent parent = new Parent();
        System.out.println(parent.first);
        //System.out.println(parent.second);
        //System.out.println(parent.third);
        //System.out.println(parent.fourth);
        parent.firstMethod();
        //parent.secondMethod();
        //parent.thirdMethod();
        //parent.fourthMethod();
    }
}
