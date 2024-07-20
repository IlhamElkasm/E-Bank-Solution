package com.bank.Controller;

import com.bank.Model.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
//@CrossOrigin(origins = "http://localhost:4200/")
public class userController {

    @GetMapping("/demo")
    public UserResponse sayHello(){

        return new UserResponse("message");
    }
}
