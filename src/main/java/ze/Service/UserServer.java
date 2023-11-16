package ze.Service;

import org.apache.ibatis.annotations.Param;
import ze.Pojo.User;

public interface UserServer {
    User select(@Param("username") String username, @Param("password") String password);
}
