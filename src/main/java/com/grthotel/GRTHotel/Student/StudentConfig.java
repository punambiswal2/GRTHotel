package com.grthotel.GRTHotel.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig
{
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository)
    {
        return args ->
        {

                     Student rex = new Student(
                            "rex",
                            "punam.bis@gmail.com",
                            LocalDate.of(2000, Month.OCTOBER, 5),

                    );

                    Student  max = new Student(
                            "max",
                            "punambiswal2@gmail.com",
                            LocalDate.of(2010, Month.JANUARY,10),

                    );


                repository.saveAll(
                        List.of(rex, max)
                );

        };
    }

}
