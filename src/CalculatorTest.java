import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza libcze: ");
        float firstNumber = scanner.nextFloat();
        System.out.println("Podaj druga libcze: ");
        float secondNumber = scanner.nextInt();

        Calculator test = new Calculator();
        System.out.println("Wynik dodawania: " + test.addition(firstNumber, secondNumber));
        System.out.println("Wynik odejmowania: " + test.subtraction(firstNumber, secondNumber));
        System.out.println("Wynik mnozenia: " + test.multiplication(firstNumber, secondNumber));
        System.out.println("Wynik dzielenia: " + test.division(firstNumber, secondNumber));
        System.out.println("Reszta z dzielenia: " + test.modulo(firstNumber, secondNumber));

    }
}

