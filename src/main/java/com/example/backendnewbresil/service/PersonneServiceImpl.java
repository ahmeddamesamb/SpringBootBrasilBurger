package com.example.backendnewbresil.service;

import com.example.backendnewbresil.model.Personne;
import com.example.backendnewbresil.repository.PersonneRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonneServiceImpl implements PersonneService{
    private final PersonneRepository personneRepository;


    public PersonneServiceImpl(PersonneRepository personneRepository ) {
        super();
        this.personneRepository = personneRepository;

    }

    @Override
    public List<Personne> getAllPersonne() {

        return personneRepository.findAll();
    }

    @Override
    public Personne createPersonne(Personne personne) {

        return personneRepository.save(personne);
    }

    @Override
    public Personne updatePersonne(long id, Personne personne) {
        return null;
    }

    @Override
    public void deletePersonne(long id) {

    }

    @Override
    public Personne getPersonneById(long id) {
        return null;
    }
}
