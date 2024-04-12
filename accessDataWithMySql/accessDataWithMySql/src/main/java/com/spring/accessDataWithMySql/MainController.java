package com.spring.accessDataWithMySql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller //spring treats this as a controller
@RequestMapping(path="/demo") // this means URL's start with /demo (After the application path)
public class MainController {

    @Autowired //This means to get the bean called userRepository
    private UserRepository userRepository;
    // You may notice you haven't given a object by saying new UserRepository , this is all done by Spring you will only need to refer to it

    @PostMapping(path= "/add") // Map only post requests
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email){
        //Response body - Returned String is the response , not a view name
        // request param - it is a parameter from the get or post request
        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userRepository.save(n);
        return "Saved";
    }


    @GetMapping(path= "/all")
    public @ResponseBody Iterable<User> getAllUsers(){
        //this returns JSON with the users
        return userRepository.findAll();
    }
}
