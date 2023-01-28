package i_InstrukcjaSterujacaSwitch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        System.out.println("Podaj danie: ");
        Scanner scanner = new Scanner(System.in);
        String danie = scanner.nextLine();

        switch (danie) {
            case "Pizza":
                System.out.println("Cena to 22 zl");
                break;
            case "Losos":
                System.out.println("Cena 35 zl");
                break;
            case "Frytki":
                System.out.println("cena to 9 zl");
                break;
            default:
                System.out.println("Brak dania w karcie");

        }

    }
}
