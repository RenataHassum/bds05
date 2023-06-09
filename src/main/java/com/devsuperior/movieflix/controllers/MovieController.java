package com.devsuperior.movieflix.controllers;

import com.devsuperior.movieflix.dtos.MovieDTO;
import com.devsuperior.movieflix.dtos.ReviewDTO;
import com.devsuperior.movieflix.services.MovieService;
import com.devsuperior.movieflix.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
