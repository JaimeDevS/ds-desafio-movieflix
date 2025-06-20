package com.devsuperior.movieflix.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.movieflix.dto.MovieDetailsDTO;
import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.repositories.MovieRepository;
import com.devsuperior.movieflix.services.exceptions.ResourceNotFoundException;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;

	@Transactional(readOnly = true)
	public MovieDetailsDTO findById(Long id) {
		Movie result = movieRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("not found"));

		return new MovieDetailsDTO(result);
	}

	@Transactional(readOnly = true)
	public Page<MovieDetailsDTO> findAll(Long genreId, Pageable pageable) {
		Page<Movie> result = movieRepository.searchByGenre(genreId, pageable);
		return result.map(x -> new MovieDetailsDTO(x));
	}
}
