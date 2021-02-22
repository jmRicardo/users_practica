package com.jmr.practica.users.users_practica.repositories;

import com.jmr.practica.entities_practica.libreria_custom_users_practica.models.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path="users")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    @RestResource(path="buscar-username")
    User findByUsername(@Param("username") String username);

}
