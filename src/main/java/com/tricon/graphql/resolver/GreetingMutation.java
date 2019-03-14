package com.tricon.graphql.resolver;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.tricon.graphql.model.Greeting;
import com.tricon.graphql.repository.GreetingsRepository;

@Component
public class GreetingMutation implements GraphQLMutationResolver {

  @Autowired
  private GreetingsRepository greetingRepository;

  public Greeting newGreeting(String message) {
    Greeting greeting = new Greeting();
    greeting.setMessage(message);
    return greetingRepository.save(greeting);
  
  }
  public boolean deleteGreeting(int id) {
		greetingRepository.deleteById(id);
	    return true;
	}
  
  public Greeting updateGreeting(String message, int id) {
	  Greeting greeting = new Greeting();
	 
	  greeting.setMessage(message);
	  greeting.setId(id);
	  greetingRepository.save(greeting);

      return greeting;
     
  }
}

