package com.agc.javaintensivo.agcintensivo.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

//Classe auxiliar para chave composta que encapsula a chave primária para a classe Belonging
@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "game_list_id")
    private GameList gameList;

    //Constructors
    public BelongingPK() {
    }

    //Constructor with parameters
    public BelongingPK(Game game, GameList gameList) {
        this.game = game;
        this.gameList = gameList;
    }

    //Getters and Setters
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getGameList() {
        return gameList;
    }

    public void setGameList(GameList gameList) {
        this.gameList = gameList;
    }

    //HashCode and Equals
    @Override
    public int hashCode() {
        return Objects.hash(game, gameList);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        BelongingPK other = (BelongingPK) obj;
        return Objects.equals(game, other.game) && Objects.equals(gameList, other.gameList);
    }

}

//Fim do código