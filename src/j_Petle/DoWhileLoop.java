package j_Petle;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita: ");
        int number = scanner.nextInt();

        // zawsze wykonuje 1 itteracje petli póŸniej sprawdza warunek
        do {
            System.out.println("Moja wartosc to: " + number + " i jest mniejsza od 20");
            number++;
        } while (number < 20);

    }
}
