package top.zhujiayu.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.zhujiayu.entity.User;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @auther zjy
 * @date 2020/6/28
 **/

@RestController
public class UserController {

    @GetMapping("/json1")
    public String json1() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        User user = new User("zjy", 22, "男");
        return objectMapper.writeValueAsString(user);
    }


    @GetMapping("/json2")
    public String json2() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        User user1 = new User("zjy1", 22, "男");
        User user2 = new User("zjy2", 22, "男");
        User user3 = new User("zjy3", 22, "男");

        List<User> users = new ArrayList();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        return objectMapper.writeValueAsString(users);
    }

    @GetMapping("/json3")
    public String json3() throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        objectMapper.setDateFormat(simpleDateFormat);

        return objectMapper.writeValueAsString(new Date());
    }

}
