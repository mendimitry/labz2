package com.psuti.Zhalnin.dao;

import com.psuti.Zhalnin.entity.Variant6.Film;
import com.psuti.Zhalnin.entity.Variant6.FilmProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface FilmRepository extends JpaRepository<Film, UUID> {
    @Query(value = "SELECT CAST(id as varchar) id, name, rating, genre, producer from film", nativeQuery = true)
    List<FilmProjection> getAllFilms();
}
