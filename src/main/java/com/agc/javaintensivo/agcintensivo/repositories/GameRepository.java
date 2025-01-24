package com.agc.javaintensivo.agcintensivo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.agc.javaintensivo.agcintensivo.entities.Game;
import com.agc.javaintensivo.agcintensivo.projections.GameMiniProjection;

// Interface que herda de JpaRepository, que é um tipo de repositório do Spring | responsável por fazer a comunicação com o banco de dados
public interface GameRepository extends JpaRepository<Game, Long> {
    
    //Método para buscar um jogo por id (Consulta nativa SQL) (Resultado deve ser uma interface)
    @Query(nativeQuery = true, value = """
		SELECT tb_game.id, tb_game.title, tb_game.game_year AS `year`, tb_game.img_url AS imgUrl,
		tb_game.short_description AS shortDescription, tb_belonging.position
		FROM tb_game
		INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
		WHERE tb_belonging.game_list_id = :listId
		ORDER BY tb_belonging.position
			""")
            
    List<GameMiniProjection> searchByList(Long listId);
}

//Fim do código