package com.psuti.Zhalnin.controller;

import com.psuti.Zhalnin.dao.UserRepository;
import com.psuti.Zhalnin.entity.Starring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityExistsException;
import java.util.List;
import java.util.UUID;


@RequestMapping("/users")
@RestController
public class UserRestController {

    private final UserRepository userRepository;

    @Autowired
    public UserRestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<Starring> getAll(){
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Starring getById (@PathVariable("id") UUID id){
        return userRepository.findById(id).get();
    }

    @PutMapping
    public Starring update (@RequestBody Starring starring){
        if(userRepository.existsById (starring.getId())) {
            return userRepository.save(starring);
        }
        throw new EntityExistsException("User with id:'"+ starring.getId() +"' doesn't exists");
    }

    @PostMapping
    public Starring create(@RequestBody Starring starring){
        return userRepository.save(starring);
    }

    @DeleteMapping("/{id}")
    public void remove (@PathVariable("id") UUID id){
        userRepository.deleteById(id);
    }
}
