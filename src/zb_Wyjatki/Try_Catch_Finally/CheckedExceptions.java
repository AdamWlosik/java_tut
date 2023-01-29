package zb_Wyjatki.Try_Catch_Finally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


    public class CheckedExceptions {

        public static void main(String[] args)  {
            try {
                System.out.println("Before reading file");
                //readFiles("C:\\Users\\adamw\\OneDrive\\Pulpit\\java_RestAssured_tut\\java\\src\\test.txt");
                readFiles("/src.asdastxt");

            } catch (FileNotFoundException e) {
                System.out.println("Wyjatek zostal wyrzucony");
                System.out.println(e.getMessage());
            } finally { // blok finally wykonuje sie zawsze
                System.out.println("Closing file");
            }
        }
        public static void readFiles(String path) throws FileNotFoundException {
            FileInputStream fileInputStream = new FileInputStream(path);
        }

    }


