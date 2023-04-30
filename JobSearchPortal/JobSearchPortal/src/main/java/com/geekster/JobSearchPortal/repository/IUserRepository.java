package com.geekster.JobSearchPortal.repository;

import com.geekster.JobSearchPortal.model.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserRepository extends CrudRepository<Users, Integer> {
 // find by employName
    public List<Users> findByEmployName(String employName);


    //custom Query
    @Query(value="select * from users order by salary asc",nativeQuery = true)
    public List<Users> findUsersOrderedBySalaryASC();
}
