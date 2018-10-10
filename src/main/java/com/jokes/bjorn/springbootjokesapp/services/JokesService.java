package com.jokes.bjorn.springbootjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesService {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesService() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String getRandomJoke(){
        return this.chuckNorrisQuotes.getRandomQuote();
    }


}
