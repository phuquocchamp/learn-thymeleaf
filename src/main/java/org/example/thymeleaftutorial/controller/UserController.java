package org.example.thymeleaftutorial.controller;

import org.example.thymeleaftutorial.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("variable-expression")
    public String variableExpression(Model model){
        User user = new User("phuquocchamp", "phuquocchamp@gmail.com", "ADMIN", "Male");
        model.addAttribute("user", user);
        return "variable-expression";
    }


    @GetMapping("fragment-expression")
    public String fragmentExpression(){
        return "fragment-expression";
    }
}
