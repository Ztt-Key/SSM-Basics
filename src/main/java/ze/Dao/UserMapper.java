package ze.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import ze.Pojo.User;

@Repository
public interface UserMapper {
//    根据用户名查询是否存在账户
  User select(@Param("username") String username, @Param("password") String password);
}
