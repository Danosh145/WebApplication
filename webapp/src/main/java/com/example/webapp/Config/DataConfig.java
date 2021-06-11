package com.example.webapp.Config;

import com.example.webapp.Model.University;
import com.example.webapp.Repository.UniversityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.time.LocalDate;
import java.util.Arrays;

@Configuration
public class DataConfig {

    //pro rychlé načtení záznamů
    @Bean
    CommandLineRunner commandLineRunnerUniversity(UniversityRepository repository){
        return args -> {
            repository.saveAll(Arrays.asList(
                    new University("TUL","Liberec", LocalDate.of(1953,10,1)),
                    new University("Karlova univerzita", "Praha", LocalDate.of(1348,4,7)),
                    new University("VUT", "Brno", LocalDate.of(1899,9,18)),
                    new University("ČVUT", "Praha", LocalDate.of(1707,1,18))
            ));
        };
    }


}
