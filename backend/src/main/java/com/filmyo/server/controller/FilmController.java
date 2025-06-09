package com.filmyo.server.controller;

import com.filmyo.server.model.Film;
import com.filmyo.server.service.FilmService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/films")
public class FilmController {

    //Properties

    private final FilmService filmService;

    //Builder

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    //Methods

    @GetMapping
    public ResponseEntity<List<Film>> getAllFilms() {
        List<Film> films = filmService.findAllFilms();
        return ResponseEntity.ok(films);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Film> getFilmById(@PathVariable int id) {
        Optional<Film> filmOptional = filmService.findFilmById(id);
        if (filmOptional.isPresent()) {
            return ResponseEntity.ok(filmOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
