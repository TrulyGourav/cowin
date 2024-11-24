package com.gkrooms.cowin.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "selected_color")
    private String selectedColor;

    @Column(name = "selected_number")
    private int selectedNumber;

    private String result;

    @Column(name = "reward_points")
    private Double rewardPoints;

    @Column(name = "game_time")
    private LocalDateTime gameTime;

    @ManyToOne
    private User user;
}

