package com.techprimers.mongodb.springbootmongodbexample.repository;

import com.techprimers.mongodb.springbootmongodbexample.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserRepository extends MongoRepository<Users, Integer> {

     Users findById(Integer id);

     Users findByName(String name);

     @Query(value="{address.city:?0}")
     List<Users> findByCity(String city);

    @Query(value="{address.pincode:?0}")
    List<Users> findByPincode(String pincode);
}
