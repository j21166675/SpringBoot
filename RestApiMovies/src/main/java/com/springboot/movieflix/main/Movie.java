package com.springboot.movieflix.main;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
    @Id
    public String movieName;
    public String movieLanguage;
    public String description;

    Movie(){

    }
    Movie(String movieName, String movieLanguage, String description){
        this.movieName = movieName;
        this.movieLanguage = movieLanguage;
        this.description = description;
    }

    public void setMovieName(String movieName){
        this.movieName = movieName;
    }

    public void setMovieLanguage(String movieLanguage){
        this.movieLanguage = movieLanguage;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getMovieName(){
        return movieName;
    }

    public String getMovieLanguage(){
        return movieLanguage;
    }

    public String getDescription(){
        return description;
    }

}
