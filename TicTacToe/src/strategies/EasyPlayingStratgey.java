package strategies;

import models.Board;
import models.Cell;
import models.Move;
import models.Player;
import models.enums.CellState;

import java.util.List;

public class EasyPlayingStratgey implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board, Player player) {
        for(List<Cell> cells: board.getCells()) {
            for(Cell cell: cells) {
                if(cell.getCellState().equals(CellState.EMPTY)) {
                    return new Move(player,cell);
                }
            }
        }
        return null;
    }
}
