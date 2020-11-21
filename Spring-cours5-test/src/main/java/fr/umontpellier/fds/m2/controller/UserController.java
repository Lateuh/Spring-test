package fr.umontpellier.fds.m2.controller;

import fr.umontpellier.fds.m2.bean.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "nom", defaultValue = "Belghanem")String nom,
                        @RequestParam(value = "prenom", defaultValue = "Ryadh")String prenom,
                        @RequestParam(value = "age", defaultValue = "25")String age){
        User u = new User(nom,prenom,Integer.parseInt(age));
        return u;
    }

    
    @GetMapping("/user/id")
    public User getUser(){
        // TO DO
        return new User();
    }


    @PostMapping("/user")
    public User postUser(@RequestBody User user){
        System.out.println("Prenom : "+user.getPrenom());
        return user;
    }
}
