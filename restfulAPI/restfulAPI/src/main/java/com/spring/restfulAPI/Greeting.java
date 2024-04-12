package com.spring.restfulAPI;

public record Greeting(long id, String content) {
}

/*This application uses the Jackson JSON library to automatically marshal instance of type Greeting into JSON*/
