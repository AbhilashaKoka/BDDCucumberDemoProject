package utilityDemoTest.ReadTest;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class PDFReaderUtil {

    public static String readPDF(String filePath) {
        String text = "";

        try (PDDocument document = PDDocument.load(new File(filePath))) {

            if (!document.isEncrypted()) {
                PDFTextStripper pdfStripper = new PDFTextStripper();
                text = pdfStripper.getText(document);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return text;
    }

    public static String readPDFByPage(String filePath, int startPage, int endPage) {
        String text = "";

        try (PDDocument document = PDDocument.load(new File(filePath))) {

            PDFTextStripper stripper = new PDFTextStripper();
            stripper.setStartPage(startPage);
            stripper.setEndPage(endPage);

            text = stripper.getText(document);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return text;
    }

    public static void main(String[] args) {
        String pdfPath = "C:/sample.pdf";
        String content = readPDF(pdfPath);
        System.out.println(content);

        String content2 = PDFReaderUtil.readPDF("C:/sample.pdf");
        if (content2.contains("Invoice Number"))
        {
            System.out.println("Invoice found!");
        }
    }

}
