package com.spring.accessDataWithMySql;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //This tells hibernate to make a table out of it
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String email;

    public void getId(Integer id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name =name;

    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }



    /*Hibernate itself translates the entity into tables our first job is just to create a database thats it*/

}
