package com.codewithjenith.springannotation.controller;

import com.codewithjenith.springannotation.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("pizzaController")
public class PizzaController {

    //Field Injection
    @Autowired
    private VegPizza vegPizza;// look you have not provided the new object


    //Constructor Injection
//    @Autowired
//    public PizzaController(VegPizza vegPizza){
//        this.vegPizza=vegPizza;
//    }


//    //Setter Injection
//    @Autowired
//    public void setVegPizza(VegPizza vegPizza){
//        this.vegPizza=vegPizza;
//    }


    public String getPizza(){
        return vegPizza.getPizza();
    }
}
