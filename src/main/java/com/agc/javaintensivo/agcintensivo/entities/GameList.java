package com.agc.javaintensivo.agcintensivo.entities;

import java.util.Objects;

public class GameList {
    
    private Long id;
    private String name;

    //Constructors
    public GameList() {
    }

    //Constructor with parameters
    public GameList(Long id, String name) {
        this.id = id;
        this.name = name;
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

    //HashCode and Equals
    @Override
    public int hashCode() {
        return Objects.hash(id);
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
        GameList other = (GameList) obj;
        return Objects.equals(id, other.id);
    }

}

//Fim do código