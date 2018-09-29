package com.inspur.springbootdemo.repository;

import com.inspur.springbootdemo.domain.TemporaryUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemporaryUserRepository extends CrudRepository<TemporaryUser, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM T_TEMPORARY_USER  WHERE USEDFLAG='0' order by id  limit 1")
    TemporaryUser findUnusedUser();
}
