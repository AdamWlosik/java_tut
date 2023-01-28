public class LoopsCheck {
    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                System.out.println("Liczba podzielna przez 3: " + i);
            }
        }

        int [] tab = new int[] {1,3,5};
        int [] tab2 = new int[tab.length];
        System.out.println("Dlugosc tablic: " + tab.length); // tab.lenght = 3
        int j = tab.length - 1; // iteracja tablicy od 0 czyli 0,1,2 = 3 dlatego lenght-1

        for(int i = 0; i < tab.length; i++){
            System.out.println(tab2[i] = tab[j]);
            j--;
        }

    }
}
