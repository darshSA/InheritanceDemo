package com.example.inheritancedemo.joinedtable;

import com.example.inheritancedemo.mappedsuperclass.User;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "jt_ta")
@Getter
@Setter
@PrimaryKeyJoinColumn(name = "user_id")
public class TA extends User {
    private double averageRating;
}
