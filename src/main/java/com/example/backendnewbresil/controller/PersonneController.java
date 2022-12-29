package com.example.backendnewbresil.controller;

import com.example.backendnewbresil.dto.PersonneDto;
import com.example.backendnewbresil.model.Client;
import com.example.backendnewbresil.model.Gestionaire;
import com.example.backendnewbresil.model.Livreur;
import com.example.backendnewbresil.model.Personne;
import com.example.backendnewbresil.repository.PersonneRepository;
import com.example.backendnewbresil.service.PersonneService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/personne")
public class PersonneController {
    private final ModelMapper modelMapper;
    private final PersonneService personneService;

    private final PersonneRepository personneRepository;


    public PersonneController(ModelMapper modelMapper,
                               PersonneService personneService,

                              PersonneRepository personneRepository) {
        super();
        this.modelMapper = modelMapper;
        this.personneService = personneService;


        this.personneRepository = personneRepository;
    }
    @GetMapping("/{type}")
    public List<PersonneDto> getAllPersonne(@PathVariable String type) {

        return personneService.getAllPersonne().stream().map(personne -> modelMapper.map(personne, PersonneDto.class))
                .collect(Collectors.toList());
    }
    @PostMapping("/{type}")
    public Personne createPost(@RequestBody PersonneDto personneDto , @PathVariable String type) {

        if (type.equalsIgnoreCase("client"))
        {


            Client newClient=new Client();
            newClient.setEmail(personneDto.getEmail());
            newClient.setPassword(personneDto.getPassword());
            newClient.setNom(personneDto.getNom());
            newClient.setPrenom(personneDto.getPrenom());
            newClient.setTelephone(personneDto.getTelephone());
            newClient.setRole("CLIENT");
            newClient.setAdresse(personneDto.getAdresse());
            System.out.println("Client Gerer avec Success");

            return personneRepository.save(newClient);

        } else if (type.equalsIgnoreCase("livreur")) {

            Livreur newLivreur= new Livreur();
            SimpleDateFormat s = new SimpleDateFormat("ddMMyyyyHHmmss");
            Date date = new Date();

            newLivreur.setEmail(personneDto.getEmail());
            newLivreur.setPassword(personneDto.getPassword());
            newLivreur.setNom(personneDto.getNom());
            newLivreur.setPrenom(personneDto.getPrenom());
            newLivreur.setTelephone(personneDto.getTelephone());
            newLivreur.setRole("LIVREUR");
            newLivreur.setEtatLivreur("Disponible");
            newLivreur.setMatriculeMoto("MAT"+ s.format(date));
            System.out.println("Livreur Gerer avec Success");

            return personneRepository.save(newLivreur);
        } else {
            Gestionaire newGestionaire= new Gestionaire();
            newGestionaire.setEmail(personneDto.getEmail());
            newGestionaire.setPassword(personneDto.getPassword());
            newGestionaire.setNom(personneDto.getNom());
            newGestionaire.setPrenom(personneDto.getPrenom());
            newGestionaire.setTelephone(personneDto.getTelephone());
            newGestionaire.setRole("GESTIONAIRE");
            System.out.println("Gestionaire Gerer avec Success");
            return personneRepository.save(newGestionaire);
        }

    }
}
