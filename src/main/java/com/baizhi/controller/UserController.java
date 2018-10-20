package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2018/10/16.
 */
@Controller
@Scope("prototype")
public class UserController {
    @Autowired
    private UserService service;
    @RequestMapping("/selectAll")
    public String selectAll(){
        List<User> list=service.selectAll();
        return "index";
    }

}
