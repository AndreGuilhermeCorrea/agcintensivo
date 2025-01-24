package com.agc.javaintensivo.agcintensivo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agc.javaintensivo.agcintensivo.dto.GameListDTO;
import com.agc.javaintensivo.agcintensivo.services.GameListService;


//Porta de entrada para requisições HTTP (Back-end)
@RestController
@RequestMapping(value = "/list")
public class GameListController {
   
    //Injeção de dependência
    @Autowired
    private GameListService gameListService;

    //Método para buscar lista de Objetos GameListDTO
    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
    
}

//Fim do código