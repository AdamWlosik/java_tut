package r_ModyfikatoryDostepu.first;

public class Child extends Parent{

    // klasa potomna w tej samej paczce nie ma dost�pu do p�l private

    public void testIdentifiresChild() {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        //System.out.println(fourth);
        firstMethod();
        secondMethod();
        thirdMethod();
        //fourthMethod();
    }
}
