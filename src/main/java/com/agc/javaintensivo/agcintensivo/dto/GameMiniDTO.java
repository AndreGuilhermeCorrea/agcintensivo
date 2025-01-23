package com.agc.javaintensivo.agcintensivo.dto;

import com.agc.javaintensivo.agcintensivo.entities.Game;

public class GameMiniDTO {
    
    private Long id;
	private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    //Construtor padrão
    public GameMiniDTO() {
    }

    //Construtor com argumento entity
    public GameMiniDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    //Getters
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}

//Fim do código