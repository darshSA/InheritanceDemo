package com.example.inheritancedemo.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "ms_ta")
@Getter
@Setter
public class TA extends User{
    private double averageRating;
}
