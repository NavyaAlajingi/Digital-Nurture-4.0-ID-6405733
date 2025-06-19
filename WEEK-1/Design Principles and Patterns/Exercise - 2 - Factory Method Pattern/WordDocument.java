public class WordDocument implements Document {
    public void open() {
        System.out.println("Word Document Opened");
    }

    public String getInfo() {
        return "This is a .docx Word file.";
    }
}
