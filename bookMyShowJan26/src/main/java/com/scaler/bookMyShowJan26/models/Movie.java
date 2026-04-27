package com.scaler.bookMyShowJan26.models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel{

    private String title;
    private int year;
    private String director;
    private String genre;
    private int rating;
    private String description;

    @ElementCollection
    private List<Language> languages;

}
