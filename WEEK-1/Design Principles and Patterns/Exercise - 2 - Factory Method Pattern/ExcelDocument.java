public class ExcelDocument implements Document {
    public void open() {
        System.out.println("Excel Document Opened");
    }

    public String getInfo() {
        return "This is a .xlsx Excel file.";
    }
}
