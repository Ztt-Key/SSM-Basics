package ze.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import ze.Pojo.Books;

import java.util.List;

@Repository
public interface BookMapper {
    int AddBook(Books books);
//    删除一本书
    int DeleteById(@Param("id") int id);
    int UpdateBook(Books books);
//    查询一本书
    Books SelectBookId(@Param("id") int id);
    List<Books>SelectAllBoos();
    /**
     * 模糊查询书籍
     */
    Books querybookname(@Param("name") String bookname);
}
