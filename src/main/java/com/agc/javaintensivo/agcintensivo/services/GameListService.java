package com.agc.javaintensivo.agcintensivo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.agc.javaintensivo.agcintensivo.dto.GameListDTO;
import com.agc.javaintensivo.agcintensivo.entities.GameList;
import com.agc.javaintensivo.agcintensivo.repositories.GameListRepository;


//Registrar como componente no spring boot com a anotação @Service
@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;
    
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}

//Fim do código
