package com.learn.example.userservice.controller;

import com.learn.example.userservice.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zjj
 * @date 2018/12/12 0012
 */
@RestController
public class UserController {

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public List<User> getUserList(){
        List<User> users = new ArrayList();
        User u1 = new User();
        u1.setName("lili");
        u1.setAge(18);
        u1.setAddr("zhongshanlu");
        users.add(u1);

        User u2 = new User();
        u2.setName("wuyusen");
        u2.setAge(18);
        u2.setAddr("zhongshanlu");
        users.add(u2);
        return users;
    }

    @RequestMapping(value = "/users/{Id}",method = RequestMethod.GET)
    public User getUserId(@PathVariable String Id){
        User u1 = new User();
        u1.setName("lili" + Id);
        u1.setAge(18);
        u1.setAddr("zhongshanlu");

        return u1;
    }


}
