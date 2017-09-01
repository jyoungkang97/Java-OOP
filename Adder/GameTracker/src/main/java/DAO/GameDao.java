/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Game;
import java.util.List;

/**
 *
 * @author jyoun
 */
public interface GameDao {
    Game createGame(Game game);
    Game getGame(String name);
    List<Game> getAllGames();
    Game updateGame(Game game);
    Game deleteGame(String name);
    
}
