package com.psuti.movies.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.psuti.movies.classes.EntityResolver;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
public class Genre {
    @Id
    private String id;

    @NotEmpty
    private String name;
}
