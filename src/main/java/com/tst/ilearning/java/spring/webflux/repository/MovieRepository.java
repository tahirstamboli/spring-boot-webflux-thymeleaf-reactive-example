package com.tst.ilearning.java.spring.webflux.repository;

import com.tst.ilearning.java.spring.webflux.models.Movie;

import reactor.core.publisher.Flux;

public interface MovieRepository {

    Flux<Movie> findAll();

}