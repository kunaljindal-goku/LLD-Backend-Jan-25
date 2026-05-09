package com.example.splitwiseJan.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "userGroup")
public class Group extends BaseEntity{

    private String name;

    /**
     * Relationship wale attributes
     */
    @ManyToMany
    private List<User> members;

    @OneToMany(mappedBy = "group")
    private List <Expense> expenses;

    @ManyToOne
    private User createdBy;

    @ManyToOne
    private User admin;
}
