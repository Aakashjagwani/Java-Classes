package com.example.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.itextpdf.text.Phrase;
import com.example.model.Student;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFBuilder extends AbstractITextPdfView{
	
	 protected void buildPdfDocument(Map<String, Object> model, Document doc,
	            PdfWriter writer, HttpServletRequest request, HttpServletResponse response)
	            throws Exception {
	        // get data model which is passed by the Spring container
	        List<Student> studentList = (List<Student>) model.get("STUDENT_LIST");
	         
	        doc.add(new Paragraph("Student Information"));
	         
	        PdfPTable table = new PdfPTable(5);
	        table.setWidthPercentage(100.0f);
	        table.setWidths(new float[] {1.5f, 2.0f, 2.0f, 3.0f, 1.0f});
	        table.setSpacingBefore(5);
	         
	        // define font for table header row
	        Font font = FontFactory.getFont(FontFactory.HELVETICA);
	        font.setColor(BaseColor.WHITE);
	         
	        // define table header cell
	        PdfPCell cell = new PdfPCell();
	        cell.setBackgroundColor(BaseColor.BLUE);
	        cell.setPadding(5);
	         
	        // write table header
	        cell.setPhrase(new Phrase("Student Id", font));
	        table.addCell(cell);
	         
	        cell.setPhrase(new Phrase("First Name", font));
	        table.addCell(cell);
	 
	        cell.setPhrase(new Phrase("Last Name", font));
	        table.addCell(cell);
	         
	        cell.setPhrase(new Phrase("Email", font));
	        table.addCell(cell);
	         
	        cell.setPhrase(new Phrase("Skill", font));
	        table.addCell(cell);
	         
	        // write table row data
	       
	        for (Student student : studentList) {
	            Long id = student.getId();
	        	String j = String.valueOf(id);
	        	table.addCell(j);
	            table.addCell(student.getFirstName());
	            table.addCell(student.getLastName());
	            table.addCell(student.getEmail());
	            table.addCell(student.getSkill().getSkill());	           
	        }
	         
	        doc.add(table);
	         
	    } 

}
