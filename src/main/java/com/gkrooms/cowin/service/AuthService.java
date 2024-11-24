package com.gkrooms.cowin.service;

import com.gkrooms.cowin.dto.UserDTO;
import com.gkrooms.cowin.entity.User;
import com.gkrooms.cowin.entity.enums.Role;
import com.gkrooms.cowin.repository.UserRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Data
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public User register(UserDTO userDTO) {
        if (userRepository.existsByEmail(userDTO.getEmail())) {
            throw new IllegalArgumentException("Email already exists.");
        }

        User user = new User();
        user.setEmail(userDTO.getEmail());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        user.setMoneyPoints(0.0);
        // set role
        if(userDTO.getRole() == null){
            throw new IllegalArgumentException("No role passed");
        }
        if(userDTO.getRole().equals("admin")){
            user.setRole(Role.ADMIN);
        } else {
            user.setRole(Role.USER);
        }
        return userRepository.save(user);
    }
}
