package com.example.inheritancedemo;

import com.example.inheritancedemo.joinedtable.MentorRepository;
import com.example.inheritancedemo.joinedtable.UserRepository;
import com.example.inheritancedemo.joinedtable.Mentor;
import com.example.inheritancedemo.joinedtable.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class InheritanceDemoApplication implements CommandLineRunner {

    private MentorRepository mentorRepository;
    private UserRepository userRepository;

    public InheritanceDemoApplication(@Qualifier("jt_mr") MentorRepository mentorRepository,
                                      @Qualifier("jt_ur") UserRepository userRepository)
    {
        this.mentorRepository = mentorRepository;
        this.userRepository = userRepository;
    }
    public static void main(String[] args) {

        SpringApplication.run(InheritanceDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    Mentor mentor = new Mentor();
        mentor.setName("Naman");
        mentor.setEmail("Naman@scaler.com");
        mentor.setAverageRating(4.65);
        mentorRepository.save(mentor);
        User user = new User();
        user.setName("Darshana");
        user.setEmail("darsh@yopmail.com");
        userRepository.save(user);

        List<User> users = userRepository.findAll();
        for (User user1 : users) {
            System.out.println(user1.getName()+" "+user1.getEmail());
        }
    }
}
