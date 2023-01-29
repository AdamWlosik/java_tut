package r_ModyfikatoryDostepu.first;

public class Random {

    // klasa w tej samej paczce nie ma dostêpu do pól/metod private
    public void testIdentifiresRandom() {
        Parent parent = new Parent();
        System.out.println(parent.first);
        System.out.println(parent.second);
        System.out.println(parent.third);
        //System.out.println(parent.fourth);
        parent.firstMethod();
        parent.secondMethod();
        parent.thirdMethod();
       //parent.fourthMethod();
    }
}
