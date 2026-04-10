import controller.GameController;
import models.Game;

public class GameClient {

    public static void main(String[] args) {

        GameController gameController = new GameController();
        Game game = gameController.startGame();

        // display board
        gameController.display(game);

        while(IN_PROGRESS) {
            // move
            // display board
            // checkwinner
            // if winner -> true
            // set -> FINISHED
        }
    }
}
