package com.example.inheritancedemo.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "st_student")
@Getter
@Setter
@DiscriminatorValue(value = "2")
public class Student extends User {
    public double psp;
    public double attendance;
}
