package com.agc.javaintensivo.agcintensivo.projections;

// Interface que define a projeção de um jogo para a tela de listagem
public interface GameMiniProjection {
    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
    
}
//Fim do código