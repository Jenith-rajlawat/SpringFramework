package com.spring.restfulAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    //Properties
    private static final String template="Hello, %s";
    private final AtomicLong counter = new AtomicLong();
    //To perform atomic operations on a 'long' variable .
    //Useful when multiple threads are accessing and modifying the same 'long' variable concurrently


    //Behaviours
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name",defaultValue ="World") String name){
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }


}

/* HTTP requests are handled by a controller. Identified by @RestController . Our Class handles GET requests
* for /greeting by
* returning a new instance of Greeting class
*
* Input /greeting url call
* Output Object of Greeting Controller class
*
* @GetMapping annotation ensures that HTTP GET requests to /greeting are mapped to the greeting() method
* For post you can use @PostMapping
*
* @RequestParam binds the value of the query string parameter name into name parameter of the greeting() method
* if name parameter arg is not passed then default value World is used
*
* THE KEY DIFFERENCE between a traditional MCV controller and the RestFul webservice controller shown earlier is the way
* that the HTTP response body is created. Rather than relying on a view technology to perform server-side
* rendering of the greeting data to HTML, this RestFul web service controller populates and returns a Greeting
* object . The object data will be written directly to the HTTP response as JSON.
*
* A restcontroller, methods returns a domain object instead of view . It is shorthand for including both controller
* responsebody
*
* The conversion of Greeting Object to JSON is done by Spring MappingJackson2HttpMessageConverter
*
*
*
*
* */

