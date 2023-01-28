import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza libcze: ");
        float firstNumber = scanner.nextFloat();
        System.out.println("Podaj druga libcze: ");
        float secondNumber = scanner.nextInt();

        float addition = firstNumber + secondNumber;
        float subtraction = firstNumber - secondNumber;
        float multiplication = firstNumber * secondNumber;
        float division = firstNumber / secondNumber;
        float mod = secondNumber % firstNumber;

        System.out.println("Wynik dodawania " + addition);
        System.out.println("Wynike odejmowania " + subtraction);
        System.out.println("Wynik mnozenia " + multiplication);
        System.out.println("Wynik dzielenia " + division);
        System.out.println("Reszta z dzielenia " + mod);


    }
}

