package com.agc.javaintensivo.agcintensivo.dto;

import org.springframework.beans.BeanUtils;

import com.agc.javaintensivo.agcintensivo.entities.GameList;

public class GameListDTO {
    
    private Long id;
    private String name;

    //Construtor padrão
    public GameListDTO() {
    }

    //Construtor com argumento entity utilizando o BeanUtils(Mesmo que gameMiniDTO)
    public GameListDTO(GameList entity) {
        BeanUtils.copyProperties(entity, this);
    }

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

// Fim do código