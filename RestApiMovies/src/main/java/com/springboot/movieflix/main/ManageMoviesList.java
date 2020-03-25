package com.springboot.movieflix.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ManageMoviesList {

    @Autowired
    private MoviesListService moviesListService;

    @RequestMapping("/movielist")
    public List<Movie> retMovieList() throws Exception{
        return moviesListService.retMovieList();
    }

    @RequestMapping("/movielist/{movieName}")
    public Movie retMovie(@PathVariable String movieName) throws Exception{
        return moviesListService.retMovie(movieName);
    }

    @RequestMapping(method= RequestMethod.POST, value = "/movielist/addMovie")
    public String addMovie(@RequestBody Movie movie){
        boolean isAdded = moviesListService.addMovie(movie);
        if(isAdded) return "Done";
        return "Not Done";
    }

}
