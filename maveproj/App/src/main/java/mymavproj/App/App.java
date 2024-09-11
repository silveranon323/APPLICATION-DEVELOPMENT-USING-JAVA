package mymavproj.App;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println("Project Started");
        Configuration cfg = new Configuration();
        cfg.configure("hibernateConfig.xml");
        SessionFactory factory = cfg.buildSessionFactory();
  
        Student std = new Student();
        std.setId(102);
        std.setName("Sheenu");
        std.setCity("Ranchi");
        System.out.println(std);
        Student anon = new Student();
        anon.setId(105);
        anon.setName("Anon");
        anon.setCity("Jsr");
        
//      anonddress ad = new Address();
//        ad.setStreet("street1");
//        ad.setCity("BBSR");
//        ad.setOpen(true);
//        ad.setAddedDate(new Date());
//        ad.setX(1234.24);
//        Address ad2 = new Address();
//        ad2.setStreet("street2");
//        ad2.setCity("Randchi");
//        ad2.setOpen(true);
//        ad2.setAddedDate(new Date());
//        ad2.setX(1235.24);
//
//        Address ad3 = new Address();
//        ad3.setStreet("street3");
//        ad3.setCity("Jamshedpur");
//        ad3.setOpen(true);
//        ad3.setAddedDate(new Date());
//        ad3.setX(1236.24);
        //Reading image
       
//        FileInputStream fis = new FileInputStream("src/main/java/hibernate.jpeg");
//        byte[] data = new byte[fis.available()];
//        fis.read();
//        ad.setImage(data);
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(std);
        session.save(anon);
//        session.save(ad);
//        session.save(ad2);
//        session.save(ad3);
       // session.getTransaction().commit();
        tx.commit();
        session.close();
        System.out.println("Done.....");
    }
}