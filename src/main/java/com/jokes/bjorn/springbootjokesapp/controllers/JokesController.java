package com.jokes.bjorn.springbootjokesapp.controllers;

import com.jokes.bjorn.springbootjokesapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/",""})
    public String getJoke(Model model){
        model.addAttribute("joke",this.jokesService.getRandomJoke());
        return "chucknorris";
    }
}
