import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ze.Pojo.Books;
import ze.Service.BookServer;

public class TestBook {
    @Test
  public void tese(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookServer bookServer = (BookServer) context.getBean("bookServer");
        for (Books selectAllBoo : bookServer.SelectAllBoos()) {
            System.out.println(selectAllBoo);
        }
    }
}
