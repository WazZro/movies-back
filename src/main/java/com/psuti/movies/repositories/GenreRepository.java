package com.psuti.movies.repositories;

import com.psuti.movies.models.Genre;
import org.springframework.data.repository.CrudRepository;

public interface GenreRepository extends CrudRepository<Genre, String> {
}
