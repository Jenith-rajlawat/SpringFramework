package com.codewithjenith.springannotation;

import com.codewithjenith.springannotation.controller.PizzaController;
import org.springframework.beans.factory.annotation.Autowired;
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
		/*@Autowired
		PizzaController pizzaController;

In your main method, you cannot directly use
@Autowired to inject PizzaController because
main is a static method and is not managed by
Spring. Spring is not aware of the main method,
so it cannot perform dependency injection
on objects created within it.

		*/
