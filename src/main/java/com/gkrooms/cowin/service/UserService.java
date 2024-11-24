package com.gkrooms.cowin.service;

import com.gkrooms.cowin.entity.User;
import com.gkrooms.cowin.entity.enums.Role;
import com.gkrooms.cowin.repository.UserRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Data
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
}

