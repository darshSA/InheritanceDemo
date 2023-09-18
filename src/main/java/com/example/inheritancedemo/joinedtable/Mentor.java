package com.example.inheritancedemo.joinedtable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "jt_mentor")
@Getter
@Setter
@PrimaryKeyJoinColumn(name = "user_id")
public class Mentor extends User {
    public double averageRating;
}
