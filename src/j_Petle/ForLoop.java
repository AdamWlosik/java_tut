package j_Petle;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe koncowa, calkowita: ");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i = i + 2 ){ // (pocz¹tek; koniec; zmiana przy kazdym przejsciu)
            System.out.println("Liczba: " + i);
        }

        for(int i = 0; i <= number; i++) {
            if (i % 5 == 0){
                System.out.println(i);
            }
        }


    }
}
