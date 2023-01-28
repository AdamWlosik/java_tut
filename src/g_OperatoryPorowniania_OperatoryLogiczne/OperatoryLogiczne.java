package g_OperatoryPorowniania_OperatoryLogiczne;

public class OperatoryLogiczne {
    public static void main(String[] args) {

        boolean firstValue = 2 > 1; // true
        boolean secondValue = 2 < 1; // false
        boolean thirdValue = false;
        boolean fourthValue = true;

        // && = i
        System.out.println("pierwszy true && drugi false: " + (firstValue && secondValue)); // false
        System.out.println("pierwszy true && czwarty true: " + (firstValue && fourthValue)); // true

        // || = lub
        System.out.println("pierwszy true || drugi false: " + (firstValue || secondValue)); // true
        System.out.println("pierwszy true || czwarty true: " + (firstValue || fourthValue)); // true
        System.out.println("drugi false || trzeci false: " + (secondValue || thirdValue)); // false

        // ! negacja
        System.out.println("!pierwszy true: " + (!firstValue)); // false
        System.out.println("!trzeci false: " + (!thirdValue)); // true
    }
}
