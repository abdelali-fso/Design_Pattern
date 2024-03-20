package org.example.adaptateur;

public class Main {
    public static void main(String[] args) {

        GenerateDocument pdfDocumentGenerator = new PDFAdapter(new PDFGenerator());
        pdfDocumentGenerator.generateDocument();

        GenerateDocument excelDocumentGenerator = new ExcelAdapter(new ExcelGenerator());
        excelDocumentGenerator.generateDocument();
    }
}
