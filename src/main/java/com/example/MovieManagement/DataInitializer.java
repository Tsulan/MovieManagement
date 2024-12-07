package com.example.MovieManagement;


import com.example.MovieManagement.entity.Movie;
import com.example.MovieManagement.repository.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner loadData(MovieRepository movieRepository) {
        return args -> {
            System.out.println("\nInitializing data...\n");

            Movie movie1 = new Movie();
            movie1.setTitle("Harry Potter");
            movie1.setDirector("Harry Potter Director");
            movie1.setGenre("Fantasy");
            movie1.setDescription("This is a Harry Potter Movie");

            Movie movie2 = new Movie();
            movie2.setTitle("Fast and Furious");
            movie2.setDirector("Fast and Furious Director");
            movie2.setGenre("Action");

            movieRepository.save(movie1);
            movieRepository.save(movie2);
            System.out.println("Initial movies:\n");
            System.out.println(movie1);
            System.out.println(movie2);
        };
    }
}
