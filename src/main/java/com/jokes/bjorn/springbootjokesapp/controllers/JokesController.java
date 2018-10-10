package com.jokes.bjorn.springbootjokesapp.controllers;

import com.jokes.bjorn.springbootjokesapp.services.JokesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokesServiceImpl jokesServiceImpl;

    @Autowired
    public JokesController(JokesServiceImpl jokesServiceImpl) {
        this.jokesServiceImpl = jokesServiceImpl;
    }

    @RequestMapping({"/", ""})
    public String getJoke(Model model) {
        model.addAttribute("joke", this.jokesServiceImpl.getRandomJoke());
        return "chucknorris";
    }
}
