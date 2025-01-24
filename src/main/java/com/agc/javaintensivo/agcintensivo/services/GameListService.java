package com.agc.javaintensivo.agcintensivo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.agc.javaintensivo.agcintensivo.dto.GameListDTO;
import com.agc.javaintensivo.agcintensivo.entities.GameList;
import com.agc.javaintensivo.agcintensivo.projections.GameMiniProjection;
import com.agc.javaintensivo.agcintensivo.repositories.GameListRepository;
import com.agc.javaintensivo.agcintensivo.repositories.GameRepository;


//Registrar como componente no spring boot com a anotação @Service
@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;
    
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }

    //Método para mover um jogo em uma lista
    @Transactional 
    public void move(Long listId, int sourceIndex, int destinationIndex){
        List<GameMiniProjection> list = gameRepository.searchByList(listId);
        GameMiniProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);
        //Atualizar a posição dos jogos na lista
        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex > destinationIndex ? destinationIndex : sourceIndex;
        for(int i = min; i <= max; i++){
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }
}

//Fim do código
