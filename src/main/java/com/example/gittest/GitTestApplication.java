package com.example.gittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

    public static void main(String[] args) {
        System.out.println("dev分支");
        SpringApplication.run(GitTestApplication.class, args);
    }

}
