package com.acro.netflix;

public class TvShow {
    String titleOfTheShow;
    Category category;
    int noOfEpisodes;
    Language language;
    public TvShow(String titleOfTheShow,Category category,int noOfEpisodes,Language language){
        this.titleOfTheShow=titleOfTheShow;
        this.category=category;
        this.noOfEpisodes=noOfEpisodes;
        this.language=language;
    }

    @Override
    public String toString() {
        return "TvShow{" +
                "titleOfTheShow='" + titleOfTheShow + '\'' +
                ", category=" + category +
                ", noOfEpisodes=" + noOfEpisodes +
                ", language=" + language +
                '}';
    }
}
