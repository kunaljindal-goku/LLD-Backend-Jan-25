package com.example.splitwiseJan.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Expense extends BaseEntity{

    private String description;
    private int amount;

    @Enumerated(EnumType.ORDINAL)
    private ExpenseType expenseType;

    /**
     * Relationship wale attributes
     */
    @ManyToOne
    private User createdBy;


    @ManyToOne
    private Group group;

    @OneToMany(mappedBy = "expense")
    List<ExpenseUser> expenseUsers;
}
