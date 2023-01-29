package w_Polimorfizm.DziedziczenieKlass;

public class DocumentChecker {
    public static void main(String[] args) {
        Document exelDocument = new ExelDocument();
        Document pdfDocument = new PdfDocument();

        exelDocument.getDescription();
        pdfDocument.getDescription();
    }
}
