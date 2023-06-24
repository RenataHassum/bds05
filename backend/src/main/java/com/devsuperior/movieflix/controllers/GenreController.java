package com.devsuperior.movieflix.controllers;

import com.devsuperior.movieflix.dtos.GenreDTO;
import com.devsuperior.movieflix.services.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/genres")
public class GenreController {

    @Autowired
    GenreService genreService;

    @GetMapping
    public ResponseEntity<List<GenreDTO>> findAll() {
        List<GenreDTO> list = genreService.findAll();
        return ResponseEntity.ok().body(list);
    }

}
