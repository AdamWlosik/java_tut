package zb_Wyjatki;

import w_PolimorfizmWebDriver.ChromeDriver;
import w_PolimorfizmWebDriver.FirefoxDriver;
import w_PolimorfizmWebDriver.WebDriver;

public class ExceptionsExample {

    public static void main(String[] args) {

        int[] numbers = new int[2];
        numbers[0] = 1;
        numbers[1] = 3;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
        //	at zb_Wyjatki.ExceptionsExample.main(ExceptionsExample.java:12)
        // dlatego ¿e i <= numbers.length a powinno byæ i < numbers.length


        WebDriver driver = getDriver("chromea");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
    }



    private static WebDriver getDriver(String name) {

        if(name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        }
        return null;
    }
    //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "w_PolimorfizmWebDriver.WebDriver.get()" because "driver" is null
    //at zb_Wyjatki.ExceptionsExample.main(ExceptionsExample.java:24)
}
