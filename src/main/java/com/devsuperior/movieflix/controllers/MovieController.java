package com.devsuperior.movieflix.controllers;

import com.devsuperior.movieflix.dtos.MovieDTO;
import com.devsuperior.movieflix.dtos.ReviewDTO;
import com.devsuperior.movieflix.services.MovieService;
import com.devsuperior.movieflix.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @Autowired
    ReviewService reviewService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<MovieDTO> findById(@PathVariable Long id) {
        MovieDTO dto = movieService.findById(id);
        return ResponseEntity.ok().body(dto);
    }

    @GetMapping(value = "/{movieId}/reviews")
    public ResponseEntity<List<ReviewDTO>> findMovieByIdWithReviews(@PathVariable Long movieId) {
        List<ReviewDTO> list = reviewService.findMovieByIdWithReviews(movieId);
        return ResponseEntity.ok().body(list);
    }

    @GetMapping
    public ResponseEntity<Page<MovieDTO>> findAllMoviesOrByGenre(
            @RequestParam(value = "genreId", defaultValue = "0") Long genreId,
            @RequestParam(value = "title", defaultValue = "") String title,
            Pageable pageable) {

        Page<MovieDTO> list = movieService.findAllMoviesOrByGenre(genreId, title.trim(), pageable);
        return ResponseEntity.ok().body(list);
    }
}
