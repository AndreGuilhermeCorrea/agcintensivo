package com.agc.javaintensivo.agcintensivo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agc.javaintensivo.agcintensivo.entities.Game;

// Interface que herda de JpaRepository, que é um tipo de repositório do Spring | responsável por fazer a comunicação com o banco de dados
public interface GameListRepository extends JpaRepository<Game, Long> {
    
}

//Fim do código