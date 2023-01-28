package h_InstrukcjaWarunkowaIf;

import java.util.Scanner;

public class InstrukcjaWarunkowaElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        float number = scanner.nextFloat();

        // jeœli jeden else if zostanie spe³niony proram nie idzie dalej
        if (number == 0) {
            System.out.println("Liczba rowna 0");
        } else if (number > 0) {
            System.out.println("Liczba dodatnia");
        } else if (number < -5) {
            System.out.println("Liczba mniejsza od -5");
        } else if (number > 10) {
            System.out.println("Liczba wieksza od 10");
        } else {
            System.out.println("Zaden warunek nie zostal seplniony");
        }

    }
}
