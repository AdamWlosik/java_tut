package e_Inkrementacja_Dekrementacja;

public class InkremenracjaDekrementacja {
    public static void main(String[] args) {

        // inkrementacja zwiększanie wartości o 1
        int a = 0;
        System.out.println("Wartosc a: " + a); // 0
        int b = a++; // postinkrementacja najpierw przypisujema b = a później zwiększzamy a++
        System.out.println("postinkrementacja Wartosc b: " + b); // 0
        System.out.println("postinkrementacha Wartosc a: " + a); // 1
        int c = ++a; // preinkrementacja najpierw zwiększamy a++ później przypisujemy c = a
        System.out.println("preinkrementacja Wartosc c: " + c); // 2
        System.out.println("preinkrementacja Wartosc a: " + a); // 2

        // dekrementacja zmniejszanie wartości o 1
        int d = 0;
        System.out.println("Wartosc d: " + d);
        int e = d--; // postdekrementacja najpierw przypisujemy e = d później d--
        System.out.println("postdekremenracja Wartosc e: " + e); // 0
        System.out.println("postdekremnetacja Wartosc d: " + d); // -1
        int f = --d; // predekremenracja najpierw --d później f = d
        System.out.println("predekremnetacja Wartosc f: " + f); // -2
        System.out.println("predekremnetacja Wartosc d: " + d); // -2
    }
}
