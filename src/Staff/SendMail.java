package Staff;



import java.util.*;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
public class SendMail
{



 public  boolean send(String appliedDate, String name, String filepath, String filename, String to)        
 {
     String subject = "Leaving Certificate";
     String body = "Dear "+name+",\n\n\tPlease find the attachment of your Leaving Certificate which is applied on "+appliedDate+". \n\n\t\t\tThank you\n\t\t\tLeaving Cerficate Generating System\n\t\t\tPravara College Of Polytechnics, Loni";
     boolean flag = false;
//Get the session object
  Properties props = new Properties();
  props.put("mail.smtp.host", "smtp.gmail.com");
  props.put("mail.smtp.socketFactory.port", "465");
  props.put("mail.smtp.socketFactory.class",
        	"javax.net.ssl.SSLSocketFactory");
  props.put("mail.smtp.auth", "true");
  props.put("mail.smtp.port", "465");

   Session session = Session.getDefaultInstance(props,
   new javax.mail.Authenticator()
   	{
   protected PasswordAuthentication getPasswordAuthentication()
   {
  return new PasswordAuthentication("innovatusproject.testing@gmail.com","ixvo xoty qgds adta");//change accordingly
   }
  });
//compose message
  try
  {
   MimeMessage message = new MimeMessage(session);
   message.setFrom(new InternetAddress("innovatusproject.testing@gmail.com"));//change accordingly   // mail from
   message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
   message.setSubject(subject);
   message.setText(body);
   MimeBodyPart messageBodyPart = new MimeBodyPart();

        Multipart multipart = new MimeMultipart();
        
//        String file = filepath;
//        String fileName = filename;
        DataSource source = new FileDataSource(filepath);
        messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName(filename);
        multipart.addBodyPart(messageBodyPart);

        message.setContent(multipart);
   //send message
   Transport.send(message);
   flag = true;
   System.out.println("message sent successfully");
  }
  catch (MessagingException e)
  {
      throw new RuntimeException(e);
  }
return flag;
 }
}