package m_Konstruktory;


public class AutoTest {
    public static void main(String[] args) {

        // je�li konstruktor Auto i parametry zdefiniowane w classie Auto
        Auto mercedes = new Auto("Mercedes", "Klasa S", 2021, 1000);
        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        // je�li korzystay z konstruktora domy�lengo Auto
        Auto audi = new Auto();
        audi.marka = "Audi";
        audi.model = "A5";
        audi.rok = 2020;
        audi.przebieg = 0;
        audi.jedz();
        audi.hamuj();
        audi.info();

        // je�li konstruktor Auto i parametry zdefiniowane w classie Auto
        Auto noName2 = new Auto(null, null, null, null);
        noName2.jedz();
        noName2.hamuj();
        noName2.info();

        // je�li korzystay z konstruktora domy�lengo Auto
        Auto noName = new Auto();
        noName.jedz();
        noName.hamuj();
        noName.info();

    }

}
