package com.gkrooms.cowin.repository;


import com.gkrooms.cowin.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {}

