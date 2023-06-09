package com.devsuperior.movieflix.services;

import com.devsuperior.movieflix.dtos.MovieDTO;
import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.repositories.MovieRepository;
import com.devsuperior.movieflix.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Transactional(readOnly = true)
    public MovieDTO findById(Long id) {
        Optional<Movie> obj = movieRepository.findById(id);
        Movie entity = obj.orElseThrow(() -> new ResourceNotFoundException(id + " not found"));
        return new MovieDTO(entity);
    }

    @Transactional(readOnly = true)
    public Page<MovieDTO> findAllMoviesOrByGenre(Long genreId, String title, Pageable pageable) {
        try {
            Page<Movie> pageMovies = movieRepository.findAll(pageable);
            Page<Movie> page = movieRepository.searchByGenre(genreId, title, pageable);

            return (genreId == 0) ? pageMovies.map(MovieDTO::new) : page.map(MovieDTO::new);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar filme " + e);
        }
    }
}
