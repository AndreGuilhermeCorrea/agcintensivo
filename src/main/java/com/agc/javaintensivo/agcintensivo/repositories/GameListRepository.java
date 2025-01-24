package com.agc.javaintensivo.agcintensivo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.agc.javaintensivo.agcintensivo.entities.GameList;

// Interface que herda de JpaRepository, que é um tipo de repositório do Spring | responsável por fazer a comunicação com o banco de dados
public interface GameListRepository extends JpaRepository<GameList, Long> {
    
    @Modifying
    @Query(nativeQuery = true, value = "UPDATE tb_belonging SET position = :newPosition WHERE game_list_id = :listId AND game_id = :gameId")
    void updateBelongingPosition(Long listId, Long gameId, Integer newPosition);

}

//Fim do código