package com.springboot.movieflix.main;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MoviesListService {
    List<Movie> list = new ArrayList<>(Arrays.asList(
            new Movie("Good News", "Hindi", "Comedy"),
            new Movie("Invisible Guest", "Tamil", "Detective"),
            new Movie("Fantastic 5", "English", "scifi"),
            new Movie("Master", "Tamil", "Comedy")));

    public List<Movie> retMovieList() {
        return list;
    }

    public Movie retMovie(String movieName) {
        return list.stream().filter(d -> d.getMovieName().equals(movieName)).findAny().get();
    }

    public boolean addMovie(Movie movie) {
      list.add(movie);
      return true;
    }
}
