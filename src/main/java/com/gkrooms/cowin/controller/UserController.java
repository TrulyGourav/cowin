package com.gkrooms.cowin.controller;

import com.gkrooms.cowin.dto.UserDTO;
import com.gkrooms.cowin.entity.Game;
import com.gkrooms.cowin.entity.User;
import com.gkrooms.cowin.service.GameService;
import com.gkrooms.cowin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

}