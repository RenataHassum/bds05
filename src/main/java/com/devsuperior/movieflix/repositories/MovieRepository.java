package com.devsuperior.movieflix.repositories;

import com.devsuperior.movieflix.entities.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    @Query("SELECT DISTINCT obj FROM Movie obj WHERE " +
            "(:genreId IS NULL OR obj.genre.id = :genreId ) AND " +
            "(LOWER(obj.title) LIKE LOWER(CONCAT('%',:title,'%'))) " +
            "ORDER BY obj.title ASC")
    Page<Movie> searchByGenre(Long genreId, String title, Pageable pageable);
}



