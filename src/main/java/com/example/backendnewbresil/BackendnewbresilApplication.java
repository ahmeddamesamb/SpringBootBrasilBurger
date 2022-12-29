package com.example.backendnewbresil;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackendnewbresilApplication implements CommandLineRunner {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
    public static void main(String[] args) {
        SpringApplication.run(BackendnewbresilApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.print("WELCOME TO MY NEW APP");
    }
}
