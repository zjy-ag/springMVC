package top.zhujiayu.controller;

import com.sun.tools.hat.internal.model.Root;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.zhujiayu.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @auther zjy
 * @date 2020/7/6
 **/

@RestController
public class AjaxController {

    @RequestMapping("/a1")
    public String ajax() {
        return "hello";
    }

    @RequestMapping("/a2")
    public void ajax2 (@RequestParam("name") String name, HttpServletResponse response) throws IOException {

        response.getWriter().write(name);

    }

    @RequestMapping("/a3")
    public List<User> ajax3(){
        List<User> list = new ArrayList<User>();
        list.add(new User("zhangsan",23,"男"));
        list.add(new User("lisi",33,"男"));
        list.add(new User("wangwu",43,"男"));
        return list; //由于@RestController注解，将list转成json格式返回
    }

    @RequestMapping("/a4")
    public String ajax4(String username){

        String s = null;

        if (!username.equals("root")) {
            s =  "username is wrong";
        }

        return s;
    }
}
