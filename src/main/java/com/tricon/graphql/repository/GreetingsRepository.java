package com.tricon.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.tricon.graphql.model.Greeting;

public interface GreetingsRepository extends JpaRepository<Greeting, Integer> { } 

