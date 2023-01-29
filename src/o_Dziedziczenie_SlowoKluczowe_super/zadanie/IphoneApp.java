package o_Dziedziczenie_SlowoKluczowe_super.zadanie;

public class IphoneApp extends AppChecker {

    public IphoneApp(String name) {
        super(name);
    }

    public void runIphoneApp() {
        System.out.println("Run " + name + " app");
    }
}
