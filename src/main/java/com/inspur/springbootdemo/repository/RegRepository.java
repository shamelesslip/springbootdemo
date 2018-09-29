package com.inspur.springbootdemo.repository;


import com.inspur.springbootdemo.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegRepository extends CrudRepository<User, Long> {
    User save(User user);

}
