package com.agc.javaintensivo.agcintensivo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agc.javaintensivo.agcintensivo.dto.GameListDTO;
import com.agc.javaintensivo.agcintensivo.dto.GameMiniDTO;
import com.agc.javaintensivo.agcintensivo.dto.ReplacementDTO;
import com.agc.javaintensivo.agcintensivo.services.GameListService;
import com.agc.javaintensivo.agcintensivo.services.GameService;


//Porta de entrada para requisições HTTP (Back-end)
@RestController
@RequestMapping(value = "/list")
public class GameListController {
   
    //Injeção de dependência
    @Autowired
    private GameListService gameListService;

    //Injeção de dependência
    @Autowired
    private GameService gameService;

    //Método para buscar lista de Objetos GameListDTO
    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    //Método para buscar lista de Objetos GameMiniDTO
    @GetMapping(value = "/{listId}/games")
    public List<GameMiniDTO> findByList(@PathVariable Long listId){
        List<GameMiniDTO> result = gameService.findByList(listId);
        return result;
    }

    //Método para buscar lista de Objetos GameMiniDTO
    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body){
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }   
}

//Fim do código