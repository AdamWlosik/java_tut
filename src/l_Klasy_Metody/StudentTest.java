package l_Klasy_Metody;

public class StudentTest {
    public static void main(String[] args) {

        Student adam = new Student();
        adam.imie = "Adam";
        adam.nazwisko = "AAA";
        adam.nick = "AdamAAA";
        adam.email = "AdamAAA@gmail.com";
        adam.numerIndeksu = 12345;

        Student pawel = new Student();
        pawel.imie = "Pawel";
        pawel.nazwisko = "BBB";
        pawel.nick = "PawelBBB";
        pawel.email = "PawelBBB@gmail.com";
        pawel.numerIndeksu = 67891;

        Student marta = new Student();
        marta.imie = "Marta";
        marta.nazwisko = "CCC";
        marta.nick = "MartaCCC";
        marta.email = "MartaCCC@gmail.com";
        marta.numerIndeksu = 28618;

        Student[] students = new Student[3];
        students[0] = adam;
        students[1] = pawel;
        students[2] = marta;

        for (int i = 0; i < students.length; i++) {
            students[i].przedstawSie();
            students[i].podajEmial();
            students[i].podajNumerIndeksu();
            students[i].zalogujSie();
        }

    }

}
