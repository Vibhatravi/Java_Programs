package com.example.demoWorkshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/people")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public List<Person> getAllPeople() {
        return personRepository.findAll();
    }

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable String id) {
        return personRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Person addPerson(@RequestBody Person person) {
        return personRepository.save(person);
    }

    @PutMapping("/{id}")
    public Person updatePerson(@PathVariable String id, @RequestBody Person updatedPerson) {
        updatedPerson.setId(id);
        return personRepository.save(updatedPerson);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable String id) {
        personRepository.deleteById(id);
    }
}
