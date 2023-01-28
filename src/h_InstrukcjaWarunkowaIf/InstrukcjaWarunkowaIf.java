package h_InstrukcjaWarunkowaIf;

import java.util.Scanner;

public class InstrukcjaWarunkowaIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dzielna: ");
        float dzielna = scanner.nextFloat();
        System.out.println("Podaj dzielnik: ");
        float dzielnik = scanner.nextFloat();

        if (dzielnik != 0) {
            System.out.println("Wynik dzielenia: " + (dzielna / dzielnik));
        } else {
            System.out.println("Dzielnik = 0 b³¹d! ");
        }
    }
}
