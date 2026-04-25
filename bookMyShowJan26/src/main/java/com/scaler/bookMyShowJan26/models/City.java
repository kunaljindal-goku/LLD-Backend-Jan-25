package com.scaler.bookMyShowJan26.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class City extends BaseModel{

    private String name;

    @OneToMany
    private List<Theatre> theatres;
}
