package com.psuti.movies.projections;

import com.psuti.movies.models.Genre;
import com.psuti.movies.models.Movie;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "inlineData", types = Movie.class)
public interface MovieProjection {
    Integer getId();
    String getRuName();
    String getOriginalName();
    List<Genre> getGenres();
}
