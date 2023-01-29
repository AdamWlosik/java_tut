package zb_Wyjatki.NoValidBrowserName;

public class FirefoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Otwieram przegladarke za pomoca Firefox");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajdujemy element za pomoca przegladarki Firegox");
    }
}
