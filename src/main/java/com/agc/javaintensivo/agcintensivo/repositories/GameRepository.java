package com.agc.javaintensivo.agcintensivo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agc.javaintensivo.agcintensivo.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}