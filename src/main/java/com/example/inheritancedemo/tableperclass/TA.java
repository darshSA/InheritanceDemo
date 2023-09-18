package com.example.inheritancedemo.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "tpc_ta")
@Getter
@Setter
public class TA extends User {
    private double averageRating;
}