package com.devsuperior.movieflix.services;

import com.devsuperior.movieflix.dtos.GenreDTO;
import com.devsuperior.movieflix.entities.Genre;
import com.devsuperior.movieflix.repositories.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GenreService {

    @Autowired
    GenreRepository genreRepository;

    @Transactional(readOnly = true)
    public List<GenreDTO> findAll() {
        List<Genre> list = genreRepository.findAll();
        return list.stream().map(x -> new GenreDTO(x)).toList();
    }
}
