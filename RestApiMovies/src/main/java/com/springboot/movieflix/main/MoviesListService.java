package com.springboot.movieflix.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MoviesListService {
    @Autowired
    public MovieRepository movieRepository;

    public List<Movie> retMovieList() {
    List<Movie> list = new ArrayList<>();
     movieRepository.findAll().forEach(list::add);
    return list;
    }

    public Movie retMovie(String movieName) {
        //return list.stream().filter(d -> d.getMovieName().equals(movieName)).findAny().get();
        return movieRepository.findById(movieName).get();  // Using Spring JPA
    }

    public boolean addMovie(Movie movie) {
     movieRepository.save(movie);
      return true;
    }
}
