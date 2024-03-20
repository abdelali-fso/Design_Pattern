package org.example.adaptateur;

public class ExcelAdapter implements GenerateDocument{
    private ExcelGenerator excelGenerator;

    public ExcelAdapter(ExcelGenerator excelGenerator) {
        this.excelGenerator = excelGenerator;
    }

    @Override
    public void generateDocument() {
        excelGenerator.generateExcel();
    }
}
