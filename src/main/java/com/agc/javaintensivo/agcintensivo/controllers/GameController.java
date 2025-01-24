package com.agc.javaintensivo.agcintensivo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agc.javaintensivo.agcintensivo.dto.GameDTO;
import com.agc.javaintensivo.agcintensivo.dto.GameMiniDTO;
import com.agc.javaintensivo.agcintensivo.services.GameService;

//Porta de entrada para requisições HTTP (Back-end)
@RestController
@RequestMapping(value = "/games")
public class GameController {
   
    //Injeção de dependência
    @Autowired
    private GameService gameService;

    //Método para buscar um jogo por id
    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
        GameDTO result = gameService.findById(id);
        return result;
    }

    //Método para buscar todos os jogos cadastrados em miniatura
    @GetMapping
    public List<GameMiniDTO> findAll(){
        List<GameMiniDTO> result = gameService.findAll();
        return result;
    }
    
}

//Fim do código