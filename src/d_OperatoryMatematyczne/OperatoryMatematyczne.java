package d_OperatoryMatematyczne;

public class OperatoryMatematyczne {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = thirdNumber / secondNumber; // firstNumber / secondNumber = 0.0 musi być float thirdNumber
        int mod = secondNumber % firstNumber;

        System.out.println("Wynik dodawania " + addition);
        System.out.println("Wynike odejmowania " + subtraction);
        System.out.println("Wynik mnozenia " + multiplication);
        System.out.println("Wynik dzielenia " + division);
        System.out.println("Reszta z dzielenia " + mod);

        firstNumber += secondNumber; // działa ze wszystkimi operacjami
        System.out.println(firstNumber);
    }
}
