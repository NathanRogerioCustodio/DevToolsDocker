package nathan.devtoolsdocker.controller;

import nathan.devtoolsdocker.entity.UserEntity;
import nathan.devtoolsdocker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping(value = "/users")
    public List<UserEntity> findAll(){
        return userRepository.findAll();
    }
}

