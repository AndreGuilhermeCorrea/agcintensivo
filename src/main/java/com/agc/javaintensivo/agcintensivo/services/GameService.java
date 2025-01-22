package com.agc.javaintensivo.agcintensivo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agc.javaintensivo.agcintensivo.dto.GameMiniDTO;
import com.agc.javaintensivo.agcintensivo.repositories.GameRepository;

//registrar componente no spring
@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    
    public List<GameMiniDTO> findAll(){
        return null;
    }
}


