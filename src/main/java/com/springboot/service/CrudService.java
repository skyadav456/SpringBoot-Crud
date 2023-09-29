package com.springboot.service;

import com.springboot.model.Characters;
import com.springboot.repository.SuperheroCharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudService {
    @Autowired
    SuperheroCharacterRepository superheroCharacterRepository;
    public void setCrudService(Characters character){
        superheroCharacterRepository.save(character);

    }

    public Characters readSuperhero(int val) {
        return superheroCharacterRepository.findById(val).get();
    }

    public List<Characters> getAllsuperhero(){
        return superheroCharacterRepository.findAll();
    }
    public void updatesuperhero(Characters superhero, int id) {
       // Characters ch=readSuperhero(id);   // read using method
      Characters tobeUpdated= superheroCharacterRepository.findById(id).get();
      tobeUpdated.setHumanName(superhero.getHumanName());
      superheroCharacterRepository.save(tobeUpdated);

    }

    public String deletesuperhero(int id) {
        superheroCharacterRepository.deleteById(id);
        return "deleted successfully";
    }

    public String deleteall() {
        superheroCharacterRepository.deleteAll();
        return "delete All Superhero";
    }
}
