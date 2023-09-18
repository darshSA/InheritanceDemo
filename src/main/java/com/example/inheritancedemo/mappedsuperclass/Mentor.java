package com.example.inheritancedemo.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "ms_mentor")
@Getter
@Setter
public class Mentor extends User{
    public double averageRating;
}
