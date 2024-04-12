package com.spring.accessDataWithMySql;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}

/*Spring automatically implements this repository interface in a bean that has the same name, just with a change in the name case ->userRepository*/


