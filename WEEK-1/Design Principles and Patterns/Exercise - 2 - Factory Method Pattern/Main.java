public class Main {
    public static void main(String[] args) {
        testFactory(new WordFactory());
        testFactory(new PdfFactory());
        testFactory(new ExcelFactory());
    }

    public static void testFactory(DocumentFactory factory) {
        Document doc = factory.createDocument();
        doc.open();
        System.out.println("Info: " + doc.getInfo());
        System.out.println("------------------------------");
    }
}
