package ze.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ze.Pojo.Books;
import ze.Service.BookServer;

import java.util.ArrayList;
import java.util.List;

@Controller

public class BookController {
    @Autowired
    @Qualifier("bookServer")
    private BookServer bookServer;

    @RequestMapping("/allbook")
    public String list(Model model){
        List<Books> books = bookServer.SelectAllBoos();
        model.addAttribute("list",books);
        return "allbook.jsp";
    }
//    跳转到添加书籍界面
    @RequestMapping("/addbook")
    public String addbookpage(){
        return "addbook.jsp";
    }
//    添加数据请求
    @PostMapping("/addbooks")
    public String addbooks(Books books){
        System.out.println("添加书籍"+books);
        bookServer.AddBook(books);
        return "redirect:/allbook";
    }
//    跳转到修改页面的请求
    @RequestMapping("/update")
    public String updatepage(int id,Model model){
        Books books = bookServer.SelectBookId(id);
        model.addAttribute("books",books);
        return "updatebook.jsp";
    }
//    修改数据的请求
    @RequestMapping("/updatebook")
    public String updatebook(Books books){
        int i = bookServer.UpdateBook(books);
        if (i>0){
            System.out.println("修改成功");
        }
        return "redirect:/allbook";
    }
    /**
     * 删除书籍
     */
    @RequestMapping("/delete/{id}")
    public String deletebook(@PathVariable("id") int id){
        bookServer.DeleteById(id);
        return "redirect:/allbook";
    }
    /**
     * 查询书籍
     */
    @RequestMapping("/querybookname")
    public String querybookname(String querybookname,Model model){
        Books querybookname1 = bookServer.querybookname(querybookname);

        List<Books>books = new ArrayList<Books>();
        books.add(querybookname1);

        model.addAttribute("list",books);
        return "allbook.jsp";
    }
}
