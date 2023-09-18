package com.example.inheritancedemo.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "ms_student")
@Getter
@Setter
public class Student extends User{
    public double psp;
    public double attendance;
}
