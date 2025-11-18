package com.fitness.userservice.Controller;


import com.fitness.userservice.DTO.RegisterRequest;
import com.fitness.userservice.DTO.UserResponse;
import com.fitness.userservice.Services.UserServices;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {

    private UserServices _userServices;

    @GetMapping("/{user_Id}")
    public ResponseEntity<UserResponse> getUser(@PathVariable String user_Id) {
            return ResponseEntity.ok(_userServices.getUserProfile(user_Id));
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponse> registerUser(@Valid @RequestBody RegisterRequest request) {
        return ResponseEntity.ok(_userServices.register(request));
    }

    @GetMapping("/{user_Id}/validate")
    public ResponseEntity<Boolean> validateUser(@PathVariable String user_Id) {
        return ResponseEntity.ok(_userServices.exitsById(user_Id));
    }

}
