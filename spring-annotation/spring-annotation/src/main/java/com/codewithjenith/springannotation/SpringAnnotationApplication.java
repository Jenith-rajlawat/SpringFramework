package com.codewithjenith.springannotation;

import com.codewithjenith.springannotation.controller.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAnnotationApplication {

	public static void main(String[] args) {

		var context=SpringApplication.run(SpringAnnotationApplication.class, args);
		PizzaController pizzaController=(PizzaController) context.getBean("pizzaController"); //basically returning an object of Pizza Controller from spring bean
		System.out.println(pizzaController.getPizza());
	}

}
