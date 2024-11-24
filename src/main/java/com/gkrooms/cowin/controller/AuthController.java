package com.gkrooms.cowin.controller;

import com.gkrooms.cowin.dto.UserDTO;
import com.gkrooms.cowin.entity.User;
import com.gkrooms.cowin.service.AuthService;
import com.gkrooms.cowin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody UserDTO userDTO) {
        // Pass the UserDTO to the service layer for user registration
        User registeredUser = authService.register(userDTO);
        return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
    }

//    @PostMapping("/login")
//    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest authRequest) {
//        // Validate user credentials
//        User user = userService.findByUsername(authRequest.getUsername())
//                .orElseThrow(() -> new RuntimeException("Invalid username or password"));
//
//        if (!passwordEncoder.matches(authRequest.getPassword(), user.getPassword())) {
//            throw new RuntimeException("Invalid username or password");
//        }
//
//        // Generate JWT token
//        String token = jwtService.generateToken(user);
//
//        // Return token and user details
//        return ResponseEntity.ok(new AuthResponse(token, user.getUsername(), user.getRole()));
//    }
}