package zb_Wyjatki;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException {
        readFiles("/src/sdsdsd.txt");
    }
    public static void readFiles(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }

}
