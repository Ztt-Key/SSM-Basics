package ze.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ze.Dao.UserMapper;

@Controller
public class UserController {

    @Autowired
  private UserMapper userMapper;
    @RequestMapping("/login")
    public String username(String name, String password){

        return "login.html";
    }
    @RequestMapping("/regist")
    public String regist(){
        return "regist.html";
    }
}
