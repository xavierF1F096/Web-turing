package com.turing.turingweb.RestControlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.turing.turingweb.Model.User;
import com.turing.turingweb.Service.UserService;


@RestController
@RequestMapping(path = "turing/api/v1")
public class RestControllerIndex {
    
    @Autowired
    private final UserService userService;
	public RestControllerIndex(UserService userService) {
        this.userService = userService;
    }
    
	@GetMapping
	public List<User> getUser(){
			return userService.getUser();
	}
	
    @PostMapping
	public void registerNewStudent(@RequestBody User user) {
		userService.addNewUser(user);
	}
	@DeleteMapping(path = "{iduser}")
	public void deleteUser(@PathVariable("iduser")Long iduser) {
		userService.deleteUser(iduser);
	}
	
	@PutMapping(path = "{iduser}")
	public void updateUser(@PathVariable("iduser")Long iduser,
			@RequestParam(required = false)String name,
			@RequestParam(required = false)String email) {
		userService.updateUser(iduser,name,email);
	}
}
