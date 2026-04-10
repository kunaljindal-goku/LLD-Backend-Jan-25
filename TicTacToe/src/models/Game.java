package models;

import models.enums.GameState;
import stratigies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private GameState gameState;
    private int nextPlayerMove;
    private Player winner;
    private List<WinningStrategy> winningStrategies;

    public Game(int size,
                List<Player> players,
                List<WinningStrategy> winningStrategies) {
        this.board = new Board(size); // Composition
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.moves = new ArrayList<>();
        this.gameState = GameState.IN_PROGRESS;
        this.nextPlayerMove = 0;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextPlayerMove() {
        return nextPlayerMove;
    }

    public void setNextPlayerMove(int nextPlayerMove) {
        this.nextPlayerMove = nextPlayerMove;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }
}
