package f_Pobieranie_z_klawiatury;

import java.util.Scanner;

public class CustomScanner {
    public static void main(String[] args) {
        Scanner scannerImie = new Scanner(System.in);
        System.out.println("Podaj swoje imie");
        String name = scannerImie.nextLine();
        System.out.println("imie: " + name);

        Scanner scannerLiczba = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int firstNumber = scannerLiczba.nextInt();
        System.out.println("Kwadrat tej liczby to: " + firstNumber * firstNumber);

    }

}
