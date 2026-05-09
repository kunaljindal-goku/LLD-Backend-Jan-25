package com.example.splitwiseJan.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "users")
public class User extends BaseEntity{

    private String name;
    private String phoneNumber;
    private String password;
}
