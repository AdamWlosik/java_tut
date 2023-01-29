package n_PolaStatyczne_MetodyStatyczne;

public class StudentTestStatyczne {
    public static void main(String[] args) {

        String nazwaUczelni = StudentStatyczne.nazwaUczelni;
        StudentStatyczne.infoUczelnia();

        StudentStatyczne adam = new StudentStatyczne();
        adam.imie = "Adam";
        adam.nazwisko = "AAA";
        adam.nick = "AdamAAA";
        adam.email = "AdamAAA@gmail.com";
        adam.numerIndeksu = 12345;
        String uczelniaAdama = adam.nazwaUczelni;
        adam.infoUczelnia();

       /* StudentStatyczne pawel = new StudentStatyczne();
        pawel.imie = "Pawel";
        pawel.nazwisko = "BBB";
        pawel.nick = "PawelBBB";
        pawel.email = "PawelBBB@gmail.com";
        pawel.numerIndeksu = 67891;

        StudentStatyczne marta = new StudentStatyczne();
        marta.imie = "Marta";
        marta.nazwisko = "CCC";
        marta.nick = "MartaCCC";
        marta.email = "MartaCCC@gmail.com";
        marta.numerIndeksu = 28618;*/

        StudentStatyczne[] students = new StudentStatyczne[1];
        students[0] = adam;
        /*students[1] = pawel;
        students[2] = marta;*/

        for (int i = 0; i < students.length; i++) {
            students[i].przedstawSie();
            students[i].podajEmial();
            students[i].podajNumerIndeksu();
            students[i].zalogujSie();
        }

    }

}
