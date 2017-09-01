/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Game;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jyoun
 */
public class GameDaoMemImpl implements GameDao {
    List<Game> games = new ArrayList<>();

    @Override
    public Game createGame(Game game) {

    }

    @Override
    public Game getGame(String name) {
        for(Game game : game) 
    }

    @Override
    public List<Game> getAllGames() {
       
    }

    @Override
    public Game updateGame(Game game) {
        int gameIndex = -1;
        for(int i = 0; i <games.size(); i++) {
            if(games.get(i).getName().equalsIgnoreCase(game.getName())){
                gameIndex = i;
            }
        }
        if(gameIndex >= 0) {
        games.remove(gameIndex);
        games.add(gameIndex, game);
        return game;
    } else {
            return null;
        }
    }

    @Override
    public Game deleteGame(String name) {
        Game tempGame = null;
        for (Game game : games) {
            if(name.equalsIgnoreCase(game.getName())) {
                tempGame = game;
            }
        }
        if (tempGame != null) {
            games.remove(tempGame); 
        }
        return tempGame;
    }


}
