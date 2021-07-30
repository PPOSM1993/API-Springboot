package com.example.demo.Student;

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
            StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    1L,
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            Student pedro = new Student(
                    2L,
                    "Pedro",
                    "pedro.osorio04@inacapmail.cl",
                    LocalDate.of(1993, Month.JULY, 5)
            );

            Student locopepe = new Student(
                    3L,
                    "Loco Pepe",
                    "loco.pepe04@inacapmail.cl",
                    LocalDate.of(1991, Month.AUGUST, 7)
            );

            repository.saveAll(
                    List.of(mariam, pedro, locopepe)
            );

        };
    }
}
