package com.springboot.movieflix.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import java.util.ArrayList;

@RestController
public class ManageMoviesList {
    @RequestMapping("/movielist")
    public List<MovieList> retMovieList(){
        ArrayList<MovieList> list = new ArrayList<>();
        list.add(new MovieList("Good News", "Hindi", "Comedy"));
        list.add(new MovieList("Invisible Guest", "Tamil", "Detective"));
        list.add(new MovieList("Fantastic 5", "English", "scifi"));
        list.add(new MovieList("Master", "Tamil", "Comedy"));
        return list;
    }
}
