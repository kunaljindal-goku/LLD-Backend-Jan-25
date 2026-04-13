package controller;

import models.Game;
import models.Player;
import models.enums.GameState;
import strategies.WinningStrategy;

import java.util.List;

public class GameController {

    public Game startGame(int size,
                          List<Player> players,
                          List<WinningStrategy> winningStrategies) {
        return Game.getBuilder()
                .setSize(size)
                .setWinningStrategies(winningStrategies)
                .setPlayers(players)
                .build();
    }

    public void display(Game game) {
        game.getBoard().display();
    }

    public GameState getGameState(Game game) {
        return game.getGameState();
    }


    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void makeMove(Game game) {
        game.makeMove();
    }
}
