package com.springboot.movieflix.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import java.util.ArrayList;

@RestController
public class ManageMoviesList {
    @RequestMapping("/movielist")
    public List<MovieList> retMovieList() throws Exception{

        return Arrays.asList(
                new MovieList("Good News", "Hindi", "Comedy"),
                new MovieList("Invisible Guest", "Tamil", "Detective"),
                new MovieList("Fantastic 5", "English", "scifi"),
                new MovieList("Master", "Tamil", "Comedy"));

    }
}
