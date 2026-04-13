package models;

import factory.BotPlayingStrategyFactory;
import models.enums.BotDifficulty;
import models.enums.PlayerType;
import strategies.BotPlayingStrategy;

public class BotPlayer extends Player{

    private BotDifficulty botDifficulty;
    private BotPlayingStrategy botPlayingStrategy;

    public BotPlayer(int id,
                       String name,
                       Symbol symbol,
                       BotDifficulty botDifficulty) {
        super(id,name,symbol, PlayerType.BOT);
        this.botDifficulty = botDifficulty;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getStrategy(botDifficulty);
    }




    public BotDifficulty getBotDifficulty() {
        return botDifficulty;
    }

    public void setBotDifficulty(BotDifficulty botDifficulty) {
        this.botDifficulty = botDifficulty;
    }

    @Override
    public Move makeMove(Board board) {
        System.out.println("Hey! Its bot's turn to make a move");
        return botPlayingStrategy.makeMove(board,this);
    }
}
