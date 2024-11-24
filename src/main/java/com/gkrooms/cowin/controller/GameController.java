package com.gkrooms.cowin.controller;

import com.gkrooms.cowin.entity.Game;
import com.gkrooms.cowin.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/game")
@RequiredArgsConstructor
public class GameController {
    private final GameService gameService;

    @GetMapping
    public List<Game> getAllGames() {
        return gameService.getAllGames();
    }
}

