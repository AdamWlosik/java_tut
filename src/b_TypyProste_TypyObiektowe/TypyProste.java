package b_TypyProste_TypyObiektowe;

public class TypyProste {
    public static void main(String[] args) {
        // liczby stałoprzecinkowe
        byte firstNumber = 127; // 1 bajt  -127 do 127
        short secondNumber = 32689; // 2 bajty -32778 do 32767
        int thirdNumber = 32768999; // 4 bajty -2 147 483 648 do 2 147 483 647
        long fourthNumber = 2148000L; // 8 bajtów -2^63 do (2^63)-1 L definiujemy, że to long

        // liczby zmiennoprzecinkowe
        float fifthNumber = 4.99934F; // 4 bajty max ok 6-7 liczb po precinku F definiujemy że to float
        double sixthNumber = 3.999999999999999D; // 8 bajtów max ok 15 liczb po przecinku D definiujemy że to double

        // wartość logiczna
        boolean prawda = true;
        boolean falsz = false;

        // pojdeyńczy znak
        char letter = 'A';

    }


}
