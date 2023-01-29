package m_Konstruktory;


public class AutoTest {
    public static void main(String[] args) {

        // jeœli konstruktor Auto i parametry zdefiniowane w classie Auto
        Auto mercedes = new Auto("Mercedes", "Klasa S", 2021, 1000);
        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        // jeœli korzystay z konstruktora domyœlengo Auto
        Auto audi = new Auto();
        audi.marka = "Audi";
        audi.model = "A5";
        audi.rok = 2020;
        audi.przebieg = 0;
        audi.jedz();
        audi.hamuj();
        audi.info();

        // jeœli konstruktor Auto i parametry zdefiniowane w classie Auto
        Auto noName2 = new Auto(null, null, null, null);
        noName2.jedz();
        noName2.hamuj();
        noName2.info();

        // jeœli korzystay z konstruktora domyœlengo Auto
        Auto noName = new Auto();
        noName.jedz();
        noName.hamuj();
        noName.info();

    }

}
