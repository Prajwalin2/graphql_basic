package com.tricon.graphql.resolver;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.tricon.graphql.model.Greeting;
import com.tricon.graphql.repository.GreetingsRepository;
@Component
public class GreetingQuery implements GraphQLQueryResolver {

  @Autowired
  private GreetingsRepository greetingsRepository;
  
  public Optional<Greeting> getGreeting(int id) {
    return greetingsRepository.findById(id);
  }
  public List<Greeting> findAllGreeting() {
      return greetingsRepository.findAll();
  }
}