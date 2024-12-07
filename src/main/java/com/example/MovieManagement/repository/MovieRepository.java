package com.example.MovieManagement.repository;


import com.example.MovieManagement.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
