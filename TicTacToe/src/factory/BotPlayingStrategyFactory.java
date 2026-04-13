package factory;

import models.BotPlayer;
import models.enums.BotDifficulty;
import strategies.BotPlayingStrategy;
import strategies.EasyPlayingStratgey;
import strategies.HardPlayingStratgey;
import strategies.MediumPlayingStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getStrategy(BotDifficulty botDifficulty) {
        if(botDifficulty.equals(BotDifficulty.EASY)) {
            return new EasyPlayingStratgey();
        }
        else if(botDifficulty.equals(BotDifficulty.MEDIUM)) {
            return new MediumPlayingStrategy();
        }
        else if(botDifficulty.equals(BotDifficulty.HARD)) {
            return new HardPlayingStratgey();
        }
        return null;
    }
}
