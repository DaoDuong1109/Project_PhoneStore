package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.model.dto.request.EmailMessage;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.EmailSenderService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

    private EmailSenderService mailer;


    public UserController(EmailSenderService emailSenderService) {
        this.mailer = emailSenderService;
    }

    @GetMapping("/findAll")
    public List<UserEntity> findAll(){return service.getUsers();}
    @GetMapping("/findById/{id}")
    public UserEntity findById(@PathVariable int id){
        return service.getById(id);
    }
    @PutMapping("/updateUserByEmail")
    public UserEntity updateUserByEmail(@RequestParam String email, @RequestBody UserEntity user){
        return service.updateUserByEmail(email, user);
    }
    @PutMapping("/updateUserById/{id}")
    public UserEntity updateUserById(@PathVariable int id, @RequestBody UserEntity user){
        return service.updateUserById(id, user);
    }
    @DeleteMapping("/deleteUser/{id}")
    public String deleteSlideById(@PathVariable int id){
        return service.delete(id);
    }
    @PostMapping("/checkin")
    public UserEntity checkin(@RequestParam("username") String username, @RequestParam("password") String password){
        return service.GetUserByEmailPass(username, password);
    }
    @PostMapping("/createUser")
    public UserEntity create(@RequestBody UserEntity user){
        return service.addUser(user);
    }
    @PostMapping("/forgot-password")
    public String forgot(@RequestParam(value = "email") String email) {

//            UserEntity userEntity = userRepository.findByEmailIgnoreCase(email);
//            String to =userEntity.getEmail();
////            String emailSend = to.substring(0, 2);
//
//            double randomDouble = Math.random();
//            randomDouble = randomDouble * 1000000 + 1;
//            int randomInt = (int) randomDouble;
//
//            String subject = "Lấy lại mật khẩu";
//            String body = "Mật khẩu của bạn là:" + randomInt;
//            mailer.send(to, subject, body);
//
//            userEntity.setPassword(String.valueOf(randomInt));
//            userRepository.save(userEntity);

        return email;

    }
}
