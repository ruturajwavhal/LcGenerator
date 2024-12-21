/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Staff;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;

import com.itextpdf.kernel.pdf.PdfWriter;
 
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.properties.HorizontalAlignment;
import com.itextpdf.layout.properties.TextAlignment;

import org.apache.poi.sl.draw.Drawable;


/**
 *
 * @author welcome
 */
public class PDFWriter
{
    public boolean getTextTOPDF(String filepath, String certificateNumber,String pupilName, String motherName, String caste, String nationality, String placeOfBirth, String dob,String lastSchool, String addmissionDate, String progress, String conduct, String leavingDate, String standard, String reason, String enrolment, String date)
    {
        boolean flag=true;
        try
        {
         PdfWriter pdfWriter= new PdfWriter(filepath);
        PdfDocument pdfDoc  = new PdfDocument(pdfWriter);
 
        // Creating a Document object
        Document doc = new Document(pdfDoc);
//         pdfDoc.setDefaultPageSize(PageSize.A4);
        //Creating Table
        float columnWidth[] = {30,40,40,60,60,190,140};
        Table table = new Table(columnWidth);
        
        
        String imgPath = "C:\\Users\\4756\\Documents\\NetBeansProjects\\LC_Creator1\\src\\Images\\logo.jpg";
        ImageData imageData = ImageDataFactory.create(imgPath);
           
        Image logo = new Image(imageData);
            
        
//        Row 1

        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
        table.addCell(new Cell(3,2).add(logo).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
        table.addCell(new Cell(1,2).add(new Paragraph("LOKNETE DR. BALASAHEB VIKHE PATIL \n" +
"(PADMA BHUSHAN AWARDEE) \n" +
"PRAVARA RURAL EDUCATION SOCIETY").setFontSize(9f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));

//        Row 2

        table.addCell(new Cell(1,3).add(new Paragraph("Certificate No\n" +
certificateNumber).setFontSize(9f).setBold().setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell(1,2).add(logo).setBorder(Border.NO_BORDER));
        table.addCell(new Cell(1,2).add(new Paragraph("PADMASHRI DR.VITTHALRAO VIKHE PATIL INSTITUE \n" +
"OF TECHNOLOGY & ENGINEERING (POLYTECHNIC)").setBold().setFontSize(9f).setFontColor(new DeviceRgb(200,0,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
        
        //        Row 3

        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
        table.addCell(new Cell(1,2).add(new Paragraph("PRAVARANAGAR Tal. Rahata, Dist. Ahmednagar(M.S)").setFontSize(9f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
        
        //        Row 4

        table.addCell(new Cell(1,7).add(new Paragraph("Approved by AICTE, New Delhi & Govt. of Maharashtra Affiliated to M.S.B.T.E.Mumbai").setFontSize(9f).setFontColor(new DeviceRgb(0,100,0)).setTextAlignment(TextAlignment.CENTER)).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));

        //        Row 5

        table.addCell(new Cell(1,7).add(new Paragraph("LEAVING CRTIFICATE").setFontSize(13f).setFontColor(new DeviceRgb(200,0,0)).setTextAlignment(TextAlignment.CENTER).setBold()).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
        
        //        Row 6

        table.addCell(new Cell(1,7).add(new Paragraph("(Prescribed by Rules 14 and 30 in chapter II of Section II of the Grant – in – aid Code)\n" +
"(No change in entry in this certificate shall be made except by the authority issuing in and any infringement of\n" +
"this requirement is liable to involve the imposition of a penalty such as that of rustication)").setTextAlignment(TextAlignment.CENTER).setFontSize(9f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
                
//        Row 7
         table.addCell(new Cell(1,7).add(new Paragraph("---------------------------------------------------------------------------------------------------------------------------------").setBold().setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));

        table.addCell(new Cell().add(new Paragraph("1)").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
        table.addCell(new Cell(1,4).add(new Paragraph("Name Of Pupil in Full").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
        table.addCell(new Cell(1,2).add(new Paragraph(pupilName).setBold().setFontColor(new DeviceRgb(0,0,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));

//        Row 8

        table.addCell(new Cell().add(new Paragraph("2)").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
        table.addCell(new Cell(1,4).add(new Paragraph("Mother’s Name").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
        table.addCell(new Cell(1,2).add(new Paragraph(motherName).setBold().setFontColor(new DeviceRgb(0,0,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
        
        //        Row 9

        table.addCell(new Cell().add(new Paragraph("3)").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
        table.addCell(new Cell(1,4).add(new Paragraph("Race Caste (with Sub-Cast)").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
        table.addCell(new Cell(1,2).add(new Paragraph(caste).setBold().setFontColor(new DeviceRgb(0,0,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
        
        //        Row 10

        table.addCell(new Cell().add(new Paragraph("4)").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
        table.addCell(new Cell(1,4).add(new Paragraph("Nationality").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
        table.addCell(new Cell(1,2).add(new Paragraph(nationality).setBold().setFontColor(new DeviceRgb(0,0,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));

        //        Row 11

        table.addCell(new Cell().add(new Paragraph("5)").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
        table.addCell(new Cell(1,4).add(new Paragraph("Place of Birth").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
        table.addCell(new Cell(1,2).add(new Paragraph(placeOfBirth).setBold().setFontColor(new DeviceRgb(0,0,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
        
        //        Row 12

        table.addCell(new Cell().add(new Paragraph("6)").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
        table.addCell(new Cell(1,4).add(new Paragraph("Date of Birth, Month & Year\n" +
"According to Christian era.\n" +
"(in word & figures)").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
       table.addCell(new Cell(1,2).add(new Paragraph(dob).setBold().setFontColor(new DeviceRgb(0,0,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
                
//        Row 13

        table.addCell(new Cell().add(new Paragraph("7)").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
        table.addCell(new Cell(1,4).add(new Paragraph("Last School attended").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
        table.addCell(new Cell(1,2).add(new Paragraph(lastSchool).setBold().setFontColor(new DeviceRgb(0,0,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));

//        Row 14

       table.addCell(new Cell().add(new Paragraph("8)").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
        table.addCell(new Cell(1,4).add(new Paragraph("Date of Admission").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
        table.addCell(new Cell(1,2).add(new Paragraph(addmissionDate).setBold().setFontColor(new DeviceRgb(0,0,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
        
        //        Row 15

        table.addCell(new Cell().add(new Paragraph("9)").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
        table.addCell(new Cell(1,4).add(new Paragraph("Progress").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
        table.addCell(new Cell(1,2).add(new Paragraph(progress).setBold().setFontColor(new DeviceRgb(0,0,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
        
        //        Row 16

       table.addCell(new Cell().add(new Paragraph("10)").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
        table.addCell(new Cell(1,4).add(new Paragraph("Conduct").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
        table.addCell(new Cell(1,2).add(new Paragraph(conduct).setBold().setFontColor(new DeviceRgb(0,0,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));

        //        Row 17

        table.addCell(new Cell().add(new Paragraph("11)").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
        table.addCell(new Cell(1,4).add(new Paragraph("Date of leaving School").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
        table.addCell(new Cell(1,2).add(new Paragraph(leavingDate).setBold().setFontColor(new DeviceRgb(0,0,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
        
        //        Row 18

        table.addCell(new Cell().add(new Paragraph("12)").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
        table.addCell(new Cell(1,4).add(new Paragraph("Standard in which studying &\n" +
"since when (in ward & figures)").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
        table.addCell(new Cell(1,2).add(new Paragraph(standard).setBold().setFontColor(new DeviceRgb(0,0,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
                
//        Row 19

        table.addCell(new Cell().add(new Paragraph("13)").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
        table.addCell(new Cell(1,4).add(new Paragraph("Reason of Leaving School").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
        table.addCell(new Cell(1,2).add(new Paragraph(reason).setBold().setFontColor(new DeviceRgb(0,0,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));

//        Row 20

       table.addCell(new Cell().add(new Paragraph("14)").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
        table.addCell(new Cell(1,4).add(new Paragraph("Enrolement No.").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
        table.addCell(new Cell(1,2).add(new Paragraph(enrolment).setBold().setFontColor(new DeviceRgb(0,0,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
        
        table.addCell(new Cell(1,7).add(new Paragraph("---------------------------------------------------------------------------------------------------------------------------------").setBold().setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
        //        Row 21

        table.addCell(new Cell(1,7).add(new Paragraph("Certified that the above information is in according with the School Register.").setTextAlignment(TextAlignment.CENTER).setFontSize(9f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
        
        //        Row 22

        table.addCell(new Cell(1,7).add(new Paragraph("\n").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//        table.addCell(new Cell().add(new Paragraph("")));
//         table.addCell(new Cell().add(new Paragraph("")));

        //        Row 23

        
       table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
        table.addCell(new Cell(1,2).add(new Paragraph("\n   Date :").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0))).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
        table.addCell(new Cell().add(new Paragraph("\n"+date).setBold().setFontColor(new DeviceRgb(0,0,0))).setBorder(Border.NO_BORDER));
        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
        table.addCell(new Cell().add(new Paragraph("\nPRINCIPAL").setFontSize(11f).setFontColor(new DeviceRgb(0,100,0)).setBold()).setBorder(Border.NO_BORDER));
        
        //        Row 24

        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
        table.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
        
        
 
//        // Adding text to the document
//        department="                    Department: "+department;
//        Text text1=new Text(department);
//        //text1.setHorizontalAlignment(HorizontalAlignment.CENTER);
//          text1.setBold();
//          
//          subject="                    Subject: "+subject;
//        Text text2=new Text(subject);
//       // text2.setHorizontalAlignment(HorizontalAlignment.CENTER);
//          text2.setBold();
//          
//           time="                    Time: "+time;
//          Text text3=new Text(time);
//          text3.setBold();
//          
//           total_marks="                    Total Marks: "+total_marks;
//          Text text4=new Text(total_marks);
//          text4.setBold();
//          
//        Text text5 = new Text(text);
// 
//       
// 
//        // Creating a paragraph 1
//        Paragraph para1 = new Paragraph(text1);
//         Paragraph para2 = new Paragraph(text2);
//          Paragraph para3 = new Paragraph(text3);
//          Paragraph para4 = new Paragraph(text4);
//          Paragraph para5 = new Paragraph(text5);
//          doc.add(para1);
//          doc.add(para2);
//          doc.add(para3);
//           doc.add(para4);
//            doc.add(para5);
//System.out.println("33333");
            doc.add(table);
          doc.close();
           System.out.println("Text added successfully..");
        }
        catch(Exception ex)
        {
            System.out.println("Exception is: "+ex);
            flag=false;
        }
        return flag;
    }

    
}
