package w_Polimorfizm.Interface;

public class DocumentChecker {
    public static void main(String[] args) {

        Document doc = new ExcelDocument();
        doc.getDescription();
        /*Document doc = new PdfDocument();
        doc.getDescription();*/
    }
}
