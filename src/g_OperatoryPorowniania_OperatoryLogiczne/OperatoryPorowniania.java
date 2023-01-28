package g_OperatoryPorowniania_OperatoryLogiczne;

public class OperatoryPorowniania {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;

        boolean results = secondNumber > firstNumber; // true
        System.out.println(results);
        System.out.println("a > b: " + (firstNumber > secondNumber)); // false
        System.out.println(firstNumber < secondNumber); // true
        System.out.println(firstNumber >= secondNumber); // false
        System.out.println(firstNumber <= secondNumber); // true
        System.out.println(firstNumber == secondNumber); // false
        System.out.println(firstNumber != secondNumber); // true

    }
}
