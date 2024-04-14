package com.codewithjenith.springannotation.controller;

import com.codewithjenith.springannotation.service.Pizza;
import com.codewithjenith.springannotation.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("pizzaController")
public class PizzaController {

    //Field Injection
    //@Autowired
    //private VegPizza vegPizza;// look you have not provided the new object
    /*Instead of injecting the class let us inject the Interface to achieve loose coupling*/
    private Pizza pizza;


//    //Constructor Injection using @Qualifier
//    @Autowired
//    public PizzaController(@Qualifier("nonVegPizza") Pizza pizza){
//        this.pizza=pizza;
//    }


    //Constructor injection where you have provided your components with @Primary
    public PizzaController( Pizza pizza){
        this.pizza= pizza;
    }

//    //Setter Injection
//    @Autowired
//    public void setVegPizza(VegPizza vegPizza){
//        this.vegPizza=vegPizza;
//    }


    public String getPizza(){
        return pizza.getPizza();
    }
}
