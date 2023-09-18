package com.example.inheritancedemo.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "tpc_mentor")
@Getter
@Setter
public class Mentor extends User {
    public double averageRating;
}
