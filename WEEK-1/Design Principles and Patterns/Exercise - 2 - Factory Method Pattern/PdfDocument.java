public class PdfDocument implements Document {
    public void open() {
        System.out.println("PDF Document Opened");
    }

    public String getInfo() {
        return "This is a .pdf file.";
    }
}

