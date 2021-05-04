package com.sb.amigostutorial.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository){
        return args -> {
            Student mariam = new Student (
                    1L,
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    21
        );
            Student yurt = new Student(
                    1L,
                    "yurt",
                    "gert@gmail.com",
                    LocalDate.of(2080, Month.JANUARY, 8),
                    88
            );
            studentRepository.saveAll(
                    List.of(mariam, yurt)
            );

        };
    }
}
