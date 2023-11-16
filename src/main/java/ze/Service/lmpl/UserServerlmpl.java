package ze.Service.lmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ze.Dao.UserMapper;
import ze.Pojo.User;

@Service
public class UserServerlmpl implements UserMapper {

    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User select(String username, String password) {
        return userMapper.select(username,password);
    }
}
