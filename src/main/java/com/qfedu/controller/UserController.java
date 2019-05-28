package com.qfedu.controller;

import com.qfedu.entity.User;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user.do")
    public String usre(){
        User byId = userService.findById(1);
        System.out.println(byId.toString());
        return "main";
    }

}
