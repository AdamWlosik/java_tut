package b_TypyProste_TypyObiektowe;

public class TypyObiektowe {
    public static void main(String[] args) {
        // liczby stałoprzecinkowe
        Byte firstNumber = 127; // 1 bajt  -127 do 127
        Short secondNumber = 32689; // 2 bajty -32778 do 32767
        Integer thirdNumber = 32768999; // 4 bajty -2 147 483 648 do 2 147 483 647
        Long fourthNumber = 2148000L; // 8 bajtów -2^63 do (2^63)-1 L definiujemy, że to long

        // liczby zmiennoprzecinkowe
        Float fifthNumber = 4.99934F; // 4 bajty max ok 6-7 liczb po precinku F definiujemy że to float
        Double sixthNumber = 3.999999999999999D; // 8 bajtów max ok 15 liczb po przecinku D definiujemy że to double

        // wartość logiczna
        Boolean prawda = true;
        Boolean falsz = false;

        // pojdeyńczy znak
        Character letter = 'A';

        // ciągi znaków
        String hello = "Hello Adam";

        System.out.println(hello.charAt(0)); // zwraca 0 znak

    }
}
