package com.springboot.movieflix.main;

public class MovieList {
    public String movieName;
    public String movieLanguage;
    public String description;

    MovieList(){

    }
    MovieList(String movieName, String movieLanguage, String description){
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
