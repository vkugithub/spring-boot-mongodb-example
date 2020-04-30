package com.techprimers.mongodb.springbootmongodbexample.resource;

import com.techprimers.mongodb.springbootmongodbexample.document.Users;
import com.techprimers.mongodb.springbootmongodbexample.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {

    private UserRepository userRepository;

    public UsersResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/all")
    public List<Users> getAll() {
        return userRepository.findAll();
    }

    @GetMapping("/id/{id}")
    public Users getUserById(@PathVariable Integer id) {
        return userRepository.findById(id);
    }

    @GetMapping("/name/{name}")
    public Users getUserByName(@PathVariable String name) {
        return userRepository.findByName(name);
    }

    @GetMapping("/city/{city}")
    public List<Users> getUserByCity(@PathVariable String city) {
        return userRepository.findByCity(city);
    }

    @GetMapping("/pincode/{pincode}")
    public List<Users> getUserByPincode(@PathVariable String pincode) {
        return userRepository.findByPincode(pincode);
    }
}
