package com.devsuperior.movieflix.services;

import com.devsuperior.movieflix.dtos.ReviewDTO;
import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.entities.Review;
import com.devsuperior.movieflix.repositories.MovieRepository;
import com.devsuperior.movieflix.repositories.ReviewRepository;
import com.devsuperior.movieflix.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    MovieRepository movieRepository;

    @Transactional(readOnly = true)
    public List<ReviewDTO> findMovieByIdWithReviews(Long movieId) {
        Movie entity = movieRepository.findById(movieId).orElseThrow(() -> new ResourceNotFoundException("Filme " + movieId + " não encontrado"));

        List<Review> list = reviewRepository.findByMovieId(movieId);
        return list.stream().map(ReviewDTO::new).toList();
    }
}
