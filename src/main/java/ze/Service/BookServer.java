package ze.Service;

import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;
import ze.Pojo.Books;

import java.util.List;

public interface BookServer {
    int AddBook(Books books);
    //    删除一本书
    int DeleteById( int id);
    int UpdateBook(Books books);
    //    查询一本书
    Books SelectBookId( int id);
    List<Books> SelectAllBoos();
    Books querybookname(String bookname);
}
