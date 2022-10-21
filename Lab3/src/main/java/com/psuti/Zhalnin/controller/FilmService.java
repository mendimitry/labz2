package com.psuti.Zhalnin.controller;

import com.psuti.Zhalnin.dao.FilmRepository;
import com.psuti.Zhalnin.entity.Variant6.FilmProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {
    @Autowired
    FilmRepository filmRepository;

    public List<FilmProjection> getFilm(){
        return filmRepository.getAllFilms();
    }
}
