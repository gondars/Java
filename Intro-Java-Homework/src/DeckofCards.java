import java.io.FileOutputStream;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class DeckofCards {

	public static void main(String[] args) {
		// declaring the 4 colors of the deck in separated arrays
		String[] spades = new String[15];
		String[] hearts = new String[15];
		String[] diamonds = new String[15];
		String[] clubs = new String[15];
		char spade = '\u2660';
		char heart = '\u2665';
		char diamond = '\u2666';
		char club = '\u2663';
		// spades cycle
		// Creating document
		try {
			Document document = new Document();
			// Giving it a name
			PdfWriter.getInstance(document, new FileOutputStream("DeckofCards.pptx"));
			// Opening the doc
			document.open();
			// Table
			PdfPTable table = new PdfPTable(4);
			table.setWidthPercentage(100);
			table.getDefaultCell().setFixedHeight(50);
			//fonts
			BaseFont baseFont = BaseFont.createFont("arial.ttf",BaseFont.IDENTITY_H,true);
			Font black = new Font(baseFont,26f,0,BaseColor.BLACK);
			Font red = new Font(baseFont,26f,0,BaseColor.RED);
			

			//spades cycle

			for (int i = 2; i < 15; i++) {
           
				if (i < 11) {
					spades[i] = i + "" + spade + " ";
				} else if (i == 11) {
					spades[i] = "J" + spade + " ";
				} else if (i == 12) {
					spades[i] = "Q" + spade + " ";
				} else if (i == 13) {
					spades[i] = "K" + spade + " ";
				} else if (i == 14) {
					spades[i] = "A" + spade + " ";
				}
			}
			// clubs cycle
			for (int i = 2; i < 15; i++) {

				if (i < 11) {
					clubs[i] = i + "" + club + " ";
				} else if (i == 11) {
					clubs[i] = "J" + club + " ";
				} else if (i == 12) {
					clubs[i] = "Q" + club + " ";
				} else if (i == 13) {
					clubs[i] = "K" + club + " ";
				} else if (i == 14) {
					clubs[i] = "A" + club + " ";
				}
			}
			// hearts cycle
			for (int i = 2; i < 15; i++) {

				if (i < 11) {
					hearts[i] = i + "" + heart + " ";
				} else if (i == 11) {
					hearts[i] = "J" + heart + " ";
				} else if (i == 12) {
					hearts[i] = "Q" + heart + " ";
				} else if (i == 13) {
					hearts[i] = "K" + heart + " ";
				} else if (i == 14) {
					hearts[i] = "A" + heart + " ";
				}
			}
			// diamonds cycle
			for (int i = 2; i < 15; i++) {

				if (i < 11) {
					diamonds[i] = i + "" + diamond + " ";
				} else if (i == 11) {
					diamonds[i] = "J" + diamond + " ";
				} else if (i == 12) {
					diamonds[i] = "Q" + diamond + " ";
				} else if (i == 13) {
					diamonds[i] = "K" + diamond + " ";
				} else if (i == 14) {
					diamonds[i] = "A" + diamond + " ";
				}
			}

			for (int i = 2; i < 15; i++) {
				table.addCell(new Paragraph(spades[i],black));				
				table.addCell(new Paragraph(clubs[i],black));
				table.addCell(new Paragraph(diamonds[i],red));
				table.addCell(new Paragraph(hearts[i],red));
				
				
			}
			document.add(table);
			document.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}