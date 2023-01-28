package j_Petle;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj libcze calkowita: ");
        int number = scanner.nextInt();

        while (number < 20) {
            System.out.println("Moja wartosc to: " + number + " i jest mniejsza od 20");
            number++;
        }
    }


}

