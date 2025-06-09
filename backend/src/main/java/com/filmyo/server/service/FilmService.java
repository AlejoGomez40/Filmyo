package com.filmyo.server.service;

import com.filmyo.server.model.Film;
import com.filmyo.server.repository.FilmRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmService {

    //Properties

    private final FilmRepository filmRepository;

    //Builders

    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    //Methods

    public List<Film> findAllFilms() {
        return filmRepository.findAll();
    }

    public Optional<Film> findFilmById(Integer id) {
        return filmRepository.findById(id);
    }

}
