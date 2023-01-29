package zb_Wyjatki.NoValidBrowserName;

public class WebDriverTest {
    public static void main(String[] args) throws NoValidBrowserName {

        WebDriver driver = getDriver("chromes");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();

    }

    private static WebDriver getDriver(String name) throws NoValidBrowserName {

        if(name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        }
        throw new NoValidBrowserName("No valid browser name");
    }
}
