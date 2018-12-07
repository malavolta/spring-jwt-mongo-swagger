package com.experimental.antonio.jwt;

import com.experimental.antonio.jwt.User.Role;
import com.experimental.antonio.jwt.User.User;
import com.experimental.antonio.jwt.User.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class JwtApplication {

    @Autowired
    UserService userService;

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public static void main(String[] args) {
        SpringApplication.run(JwtApplication.class, args);
    }
}
