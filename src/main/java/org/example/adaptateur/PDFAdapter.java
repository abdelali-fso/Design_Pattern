package org.example.adaptateur;

public class PDFAdapter implements GenerateDocument{
    private PDFGenerator pdfGenerator;

    public PDFAdapter(PDFGenerator pdfGenerator) {
        this.pdfGenerator = pdfGenerator;
    }

    @Override
    public void generateDocument() {
        pdfGenerator.generatePDF();
    }
}
