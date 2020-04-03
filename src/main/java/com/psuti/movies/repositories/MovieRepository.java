package com.psuti.movies.repositories;

import com.psuti.movies.models.Movie;
import com.psuti.movies.projections.MovieProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = MovieProjection.class)
public interface MovieRepository extends PagingAndSortingRepository<Movie, Integer> {
}
