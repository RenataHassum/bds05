package com.devsuperior.movieflix.services;

import com.devsuperior.movieflix.dtos.ReviewDTO;
import com.devsuperior.movieflix.entities.Review;
import com.devsuperior.movieflix.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    @Transactional(readOnly = true)
    public List<ReviewDTO> findMovieByIdWithReviews(Long movieId) {
        List<Review> list = reviewRepository.findByMovieId(movieId);
        return list.stream().map(x -> new ReviewDTO(x)).toList();
    }
}
