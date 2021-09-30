package com.example.lesson8springwithpostgresdb.controller;

import com.example.lesson8springwithpostgresdb.model.Data;
import com.example.lesson8springwithpostgresdb.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @Autowired
    private DataRepository repository;

    @GetMapping("/")
    public String openMain() {
        return "main";
    }

    @PostMapping("/")
    public String saveDataInRepository(@RequestParam String email, @RequestParam String login, @RequestParam String password) {
        Data data = new Data(email, login, password);
        repository.save(data);
        return "";
    }

    @PostMapping("/myUser")
    public String getUsers(Model model) {
        Iterable<Data> iterable = repository.findAll();
        model.addAttribute("users", iterable);
        return "myUser";
    }
}
