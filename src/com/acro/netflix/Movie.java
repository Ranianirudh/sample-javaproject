package com.acro.netflix;

public class Movie {

//    New releases,Blockbuster movies, continue watching, watch it again, kids&family movies
    String titleOfTheMovie;
    int ratings;
    int year;
    Category categories;
    Language language;
    public Movie(String titleOfTheMovie, int ratings, int year, Category categories, Language language) {
        this.titleOfTheMovie = titleOfTheMovie;
        this.ratings = ratings;
        this.year = year;
        this.categories = categories;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "titleOfTheMovie='" + titleOfTheMovie + '\'' +
                ", ratings=" + ratings +
                ", year=" + year +
                ", categories=" + categories +
                ", language=" + language +
                '}';
    }
}
