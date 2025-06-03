package com.devsuperior.movieflix.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.devsuperior.movieflix.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	@Query("SELECT obj FROM Movie obj " +
			"WHERE (:genreId = 0 OR obj.genre.id = :genreId)"
			+ "ORDER BY title")
	Page<Movie> searchByGenre(@Param("genreId") Long genreId, Pageable pageable);
}
