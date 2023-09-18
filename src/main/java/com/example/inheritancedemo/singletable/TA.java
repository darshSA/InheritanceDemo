package com.example.inheritancedemo.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "st_ta")
@Getter
@Setter
@DiscriminatorValue(value = "3")
public class TA extends User {
    private double averageRating;
}