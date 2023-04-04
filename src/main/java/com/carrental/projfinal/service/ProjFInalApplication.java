package com.carrental.projfinal.service;

import com.carrental.projfinal.model.User;
import com.carrental.projfinal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.swing.*;

@SpringBootApplication
public class ProjFInalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjFInalApplication.class, args);
    }

}
