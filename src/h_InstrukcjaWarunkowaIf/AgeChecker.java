package h_InstrukcjaWarunkowaIf;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Nie mozesz kupic alko");
        } else {
            System.out.println("Dziekuje za zakup");
        }

    }
}
