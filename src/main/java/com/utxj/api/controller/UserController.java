package com.utxj.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.utxj.api.entity.User;
import com.utxj.api.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

@Autowired
private UserService userService;

@PostMapping
public User createUser(@RequestBody User user) {
return userService.createUser(user);
}

@GetMapping
public List<User> getAllUsers(){
return userService.getAllUsers();
}

@GetMapping("/{id}")
public User getUserById(@PathVariable Long id) {
return userService.getUserById(id);
}

@PutMapping("/{id}")
public User updateUser(@PathVariable Long id, @RequestBody User user){
    return userService.updateUser (id, user);
}


@DeleteMapping("/{id}")
public void deleteUser(@PathVariable Long id) {
userService.deleteUser(id);
}

}

