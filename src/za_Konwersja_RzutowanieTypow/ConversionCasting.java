package za_Konwersja_RzutowanieTypow;

import u_Interface.drivers.FirefoxDriver;
import u_Interface.drivers.WebDriver;

public class ConversionCasting {
    public static void main(String[] args) {

        int a = 2;
        double b = 4.23;

        double c = a / b; // niejawna konwersja z inta do doubla

        // int d = a / b; nie mo¿na nie jawinie konwertowac z double do inta mo¿na utraciæ czesc danich po przecinku

        int d = a / (int) b; // jawna konwersja (rêczna) dzia³a

        System.out.println(c);
        System.out.println(d);

        WebDriver driver = new FirefoxDriver();
        FirefoxDriver firefoxDriver = (FirefoxDriver) driver;
        firefoxDriver.get();
    }
}
