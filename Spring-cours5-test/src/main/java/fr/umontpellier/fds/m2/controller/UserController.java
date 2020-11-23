package fr.umontpellier.fds.m2.controller;

import fr.umontpellier.fds.m2.bean.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "nom", defaultValue = "Belghanem")String nom,
                        @RequestParam(value = "prenom", defaultValue = "Ryadh")String prenom,
                        @RequestParam(value = "age", defaultValue = "25")String age){
        User u = new User(nom,prenom,Integer.parseInt(age));
        return u;
    }

    //renvoie liste de tous les utilisateurs
    @CrossOrigin("*")
    @GetMapping("/users")
    public List<User> getUsers(){
        List<User> listUsers = new ArrayList<>();
        for(int i = 0;i<10;i++){
            listUsers.add(new User("Nom"+i,"Prenom"+i,10+i));
        }
        return listUsers;
    }

    
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable int id){
        return new User("Nom"+id,"Prenom"+id,id+10);
    }


    @PostMapping("/user")
    public User postUser(@RequestBody User user){
        System.out.println("Prenom : "+user.getPrenom());
        return user;
    }
}
