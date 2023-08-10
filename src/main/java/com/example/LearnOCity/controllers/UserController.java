package com.example.LearnOCity.controllers;

import com.example.LearnOCity.dto.UserDTO;
import com.example.LearnOCity.models.User;
import com.example.LearnOCity.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final ModelMapper modelMapper;

    public UserController(UserService userService, ModelMapper modelMapper) {
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    @PostMapping("/login")
    public ResponseEntity<HttpStatus> login(@RequestParam("username") String username,
                                            @RequestParam("password") String password) {
        return null;
    }

    @PostMapping("/registration")
    public UserDTO signUp(@RequestBody UserDTO userDTO) {
        User user = convertToUser(userDTO);
//        userService.save(user);
        return null;
    }

    private User convertToUser(UserDTO userDTO) {
        modelMapper.map(userDTO, User.class);
return null;
    }


}
