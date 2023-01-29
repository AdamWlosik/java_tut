package u_Interface.zadanie;

public class ChromeDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Otwieram przegladarke za pomoca Chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajdujemy element za pomoca przegladarki Chrome");

    }
}
