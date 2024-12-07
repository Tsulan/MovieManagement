package com.example.MovieManagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Поле1 обязательно")
    @Column(unique = true, nullable = false)
    private String title;

    @NotBlank(message = "Поле2 обязательно")
    @Column(nullable = false)
    private String director;

    @Column(nullable = false)
    private String genre;

    @Lob
    @Column()
    private String description;
}

