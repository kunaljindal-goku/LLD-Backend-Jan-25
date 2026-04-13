package models;

import exceptions.InvalidPlayerException;
import models.enums.CellState;
import models.enums.GameState;
import strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Vector;

public class Game {

    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private GameState gameState;
    private int nextPlayerMove;
    private Player winner;
    private List<WinningStrategy> winningStrategies;

    private Game(int size,
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

//    private void validate(Move move) {
//        int row = move.getCell().getRow();
//        int col = move.getCell().getCol();
//
//        if(row>=0 && row<board.getSize() && col >= 0 && col<)
//    }

    public void makeMove() {
        Player currPlayer = players.get(nextPlayerMove);
        System.out.println("It's "+ currPlayer.getName() + " turn");

        Move move = currPlayer.makeMove(board);
        // validate
        //validate(move);

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Cell cell = board.getCells().get(row).get(col);
        cell.setPlayer(currPlayer);
        cell.setCellState(CellState.FILLED);
        moves.add(move);

        nextPlayerMove = (nextPlayerMove+1)%players.size();

        if(checkWinner(move)) {
            this.winner = currPlayer;
            this.gameState = GameState.COMPLETED;
        }
        else if(moves.size()==board.getSize()*board.getSize()) {
            this.gameState = GameState.DRAW;
        }
    }

    private boolean checkWinner(Move move) {
        for(WinningStrategy winningStrategy: winningStrategies) {
            if(winningStrategy.checkWinner(move)) {
                return true;
            }
        }
        return false;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        int size;
        List<Player> players;
        List<WinningStrategy> winningStrategies;

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        void validate() {
            validateNumOfplayers();
//            valdiateBotCount();
//            validateUniquePlayerSymbols();
        }

        private void validateNumOfplayers() {
            if(players.size()!=size-1) {
                throw new InvalidPlayerException("Player count should be less than"+size+"-1");
            }
        }

        public Game build() {
            validate();
            return new Game(size,players,winningStrategies);
        }
    }
}
