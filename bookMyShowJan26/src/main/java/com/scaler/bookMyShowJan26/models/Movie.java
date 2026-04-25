package com.scaler.bookMyShowJan26.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

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
}
