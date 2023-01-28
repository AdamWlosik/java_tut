import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek: ");
        int age = scanner.nextInt();

        if (age < 18){
            System.out.println("Wiek mniejszy niz 18");
        }

    }
}
