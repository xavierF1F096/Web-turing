package com.turing.turingweb.Service;

import java.util.List;
import java.util.Objects;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turing.turingweb.Model.User;
import com.turing.turingweb.Respository.UserRepository;

@Service
public class UserService {
     

   @Autowired
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
}

    public List<User> getUser() {
        return userRepository.findAll();
    }

    public void addNewUser(User user) {
		userRepository.save(user);
		System.out.println(user);
    }

    public void deleteUser(Long iduser) {
        boolean exists=userRepository.existsById(iduser);
		if(!exists) {
			throw new IllegalStateException("student id:"+iduser+"does not exists");
		}
		userRepository.deleteById(iduser);
    }
    @Transactional
    public void updateUser(Long iduser, String name, String email) {
        User user=userRepository.findById(iduser)
				.orElseThrow(() -> new IllegalStateException("student id:"+iduser+"does not exists"));
				
				if(name !=null && name.length()>0 && !Objects.equals(user.getName(), name)) {
					user.setName(name);
				}
				
					user.setEmail(email);
				}
   
   
}

     
    
        

