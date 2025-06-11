package com.filmyo.server.model;

import jakarta.persistence.*;

//Podriamos usar LomBok pero es mejor entender todo esto

@Entity
@Table(name = "films")
public class Film {

    //Properties

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique = true)
    private String title;
    @Column(length = 2000)
    private String synopsis;
    @Column(name = "launch_year")
    private Integer launchYear;
    @Column(nullable = false, unique = true)
    private String urlPoster;

    //Builders

    public Film() {

    }

    public Film(String title, String synopsis, Integer launchYear, String urlPoster) {
        this.title = title;
        this.synopsis = synopsis;
        this.launchYear = launchYear;
        this.urlPoster = urlPoster;
    }

    //Getters & Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Integer getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(Integer launchYear) {
        this.launchYear = launchYear;
    }

    public String getUrlPoster() {
        return urlPoster;
    }

    public void setUrlPoster(String urlPoster) {
        this.urlPoster = urlPoster;
    }

}
