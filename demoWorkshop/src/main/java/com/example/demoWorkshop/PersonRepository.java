package com.example.demoWorkshop;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person,String>{
	
}
