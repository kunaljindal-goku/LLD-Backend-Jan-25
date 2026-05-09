package com.example.splitwiseJan.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ExpenseUser extends BaseEntity{

    private int amount;

    @Enumerated(EnumType.ORDINAL)
    private ExpenseUserType expenseUserType;

    /**
     * Relationship wale attributes
     */
    @ManyToOne
    private Expense expense;

    @ManyToOne
    private User user;


}
