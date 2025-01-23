package com.agc.javaintensivo.agcintensivo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agc.javaintensivo.agcintensivo.dto.GameMiniDTO;
import com.agc.javaintensivo.agcintensivo.entities.Game;
import com.agc.javaintensivo.agcintensivo.repositories.GameRepository;

//Registrar como componente no spring boot com a anotação @Service
@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    
    public List<GameMiniDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMiniDTO> listDto = result.stream().map(x -> new GameMiniDTO(x)).toList();
        return listDto;
    }

}

//Fim do código
