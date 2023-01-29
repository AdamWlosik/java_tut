package o_Dziedziczenie_SlowoKluczowe_super.zadanie;


public class AppTest {
    public static void main(String[] args) {

        AndroidApp androidApp = new AndroidApp("adnroid");
        androidApp.appInfo();
        androidApp.runAndroidApp();

        IphoneApp iphoneApp = new IphoneApp("iphone");
        iphoneApp.appInfo();
        iphoneApp.runIphoneApp();
    }
}
