package com.filmyo.server.repository;

import com.filmyo.server.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Integer> {

}
