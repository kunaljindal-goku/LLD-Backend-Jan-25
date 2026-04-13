package strategies;

import models.Move;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy{

    int size;
    //symbolName, count
    private HashMap<String, Integer> rowCount[];

    public RowWinningStrategy(int size) {
        this.size = size;
        rowCount = new HashMap[size];
        for(int i=0;i<size;i++){
            rowCount[i] = new HashMap<>();
        }
    }

    @Override
    public boolean checkWinner(Move move) {
        //step 1 -> row
        int row = move.getCell().getRow();

        // get map of current row
        HashMap<String, Integer> currRowMap = rowCount[row];

        String currSym = move.getPlayer().getSymbol().getSymbolName();

        // first time user entry
        if(!currRowMap.containsKey(currSym)) {
            currRowMap.put(currSym,1);
        }
        else currRowMap.put(currSym,currRowMap.get(currSym)+1);

        if(currRowMap.get(currSym)==size) return true;
        return false;
    }
}
