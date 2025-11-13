package LLDRevisionScaler.TicTacToe.service.strategy.WinnigStrategy;

import LLDRevisionScaler.TicTacToe.model.Board;
import LLDRevisionScaler.TicTacToe.model.Game;
import LLDRevisionScaler.TicTacToe.model.Move;
import LLDRevisionScaler.TicTacToe.model.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RowWinningStrategy implements WinningStrategy {

    private int dimension;
    List<HashMap<Character,Integer>> rowWisehm = new ArrayList<>();

    public RowWinningStrategy(int dimension){
        this.dimension = dimension;
        for(int i = 0 ; i < dimension; i++){
            rowWisehm.add(new HashMap<>());
        }
    }
    @Override
    public boolean checkWinner(Game game, Move move) {

        int row = move.getCell().getRow();
//        int col = move.getCell().getCol();
        char symbol = move.getPlayer().getSymbol();

        HashMap<Character,Integer> rowhm = rowWisehm.get(row);
        if(rowhm.containsKey(symbol)){
            rowhm.put(symbol,rowhm.get(symbol)+1);
            if(rowhm.get(symbol) == dimension){
                return true;
            }
        }else{
            rowhm.put(symbol,1);
        }
        return false;
    }
}
