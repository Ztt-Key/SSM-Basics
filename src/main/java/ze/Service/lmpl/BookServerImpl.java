package ze.Service.lmpl;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import ze.Dao.BookMapper;
import ze.Pojo.Books;
import ze.Service.BookServer;

import javax.annotation.Resource;
import java.util.List;
@Service
// 开启注解
@EnableTransactionManagement
public class BookServerImpl implements BookServer {

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int AddBook(Books books) {
        return bookMapper.AddBook(books);
    }
    @Override
    public int DeleteById(int id) {
        return bookMapper.DeleteById(id);
    }
//    让spring帮我们提交事务的注解
    @Override
    public int UpdateBook(Books books) {
        System.out.println("books=====>"+books);
        return bookMapper.UpdateBook(books);
    }

    @Override
    public Books SelectBookId(int id) {
        return bookMapper.SelectBookId(id);
    }

    @Override
    public List<Books> SelectAllBoos() {
        return bookMapper.SelectAllBoos();
    }

    @Override
    public Books querybookname(String bookname) {
        return bookMapper.querybookname(bookname);
    }
}
