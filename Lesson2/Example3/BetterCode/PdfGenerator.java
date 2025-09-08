package Lesson2.Example3.BetterCode;

public class PdfGenerator implements ReportGenerator {
    @Override
    public String generate() {
        return "Generating PDF report";
    }
    
}
