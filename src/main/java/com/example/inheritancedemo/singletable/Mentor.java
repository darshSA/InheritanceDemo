package com.example.inheritancedemo.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "st_mentor")
@Getter
@Setter
@DiscriminatorValue(value = "1")
public class Mentor extends User {
    public double averageRating;
}
