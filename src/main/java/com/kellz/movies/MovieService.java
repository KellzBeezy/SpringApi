package com.kellz.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        System.out.println("data "+movieRepository.findAll());
       return movieRepository.findAll();
    }
}
