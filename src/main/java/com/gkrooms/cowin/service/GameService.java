package com.gkrooms.cowin.service;

import com.gkrooms.cowin.entity.Game;
import com.gkrooms.cowin.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GameService {
    private final GameRepository gameRepository;

    @Scheduled(fixedRate = 30000)
    public void generateGameTurn() {
        Game game = new Game();
        game.setGameTime(LocalDateTime.now());
        game.setSelectedColor(randomColor());
        game.setSelectedNumber(randomNumber());

        gameRepository.save(game);
        System.out.println("New game turn generated: " + game);
    }

    private String randomColor() {
        String[] colors = {"RED", "GREEN", "BLUE"};
        return colors[(int) (Math.random() * colors.length)];
    }

    private int randomNumber() {
        return (int) (Math.random() * 9) + 1;
    }

    // Method to fetch all games
    public List<Game> getAllGames() {
        return gameRepository.findAll(); // Fetch all games from the database
    }
}

