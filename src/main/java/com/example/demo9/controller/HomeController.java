package com.example.demo9.controller;

import com.example.demo9.domain.User;
import com.example.demo9.repository.UserMapper;
import com.example.demo9.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.reflect.Method;
import java.util.List;
@Controller
@RequestMapping(value = "/cc")
public class HomeController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/cc",method = RequestMethod.GET )
    public String home(Model model){
        // , int age, String name
        //System.out.println(age + name);
        List<User> users = userService.selectAll();
        model.addAttribute("users", users);
        return "home";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
