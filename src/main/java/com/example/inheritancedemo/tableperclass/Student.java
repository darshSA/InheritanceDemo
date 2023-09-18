package com.example.inheritancedemo.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "tpc_student")
@Getter
@Setter
public class Student extends User {
    public double psp;
    public double attendance;
}
