package com.example.inheritancedemo.singletable;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "st_user")
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "userType", discriminatorType = DiscriminatorType.INTEGER)
@DiscriminatorValue(value = "0")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String name;
    public String email;
}
