package com.springboot.Controller;

import com.springboot.model.Characters;
import com.springboot.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CrudController {

    @Autowired
    CrudService crudService;

    @PostMapping(path="create")
    public void createSperHero(@RequestBody Characters superhero){
        crudService.setCrudService(superhero);

    }
    //localhost:8080/get?id=1
    @GetMapping("read")
    public Characters readSuperHero(@RequestParam(name = "id") int value){
       return crudService.readSuperhero(value);

    }
    // localhost:8080/readAll
    @GetMapping("readAll")
    public List<Characters> getAllSuperhero(){
        return  crudService.getAllsuperhero();
    }

    //localhost:8080/update?id=
    @PutMapping("update")
    public  void updateSuperhero(@RequestBody Characters superhero, @RequestParam( name="id") int id){
        crudService.updatesuperhero(superhero,id);
    }

    //localhost:8080/delete?id=
    @DeleteMapping("delete")
    public void deleteSuperhero(@RequestParam(name="id") int id){
        crudService.deletesuperhero(id);

    }

    //Delete all Employee
    @DeleteMapping("deleteAll")
    public  String deleteAllSuperHero(){
        return crudService.deleteall();

    }
}
