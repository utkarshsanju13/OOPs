package LLDRevisionScaler.TicTacToe.service.strategy.WinnigStrategy;

import LLDRevisionScaler.TicTacToe.model.Game;
import LLDRevisionScaler.TicTacToe.model.Move;
import LLDRevisionScaler.TicTacToe.model.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ColumWinningStategy implements WinningStrategy {

    private int dimension;
    List<HashMap<Character,Integer>> colWisehm = new ArrayList<>();

    public ColumWinningStategy(int dimension){
        this.dimension = dimension;
        for(int i = 0 ; i < dimension; i++){
            colWisehm.add(new HashMap<>());
        }
    }

    @Override
    public boolean checkWinner(Game game, Move move) {

        int col = move.getCell().getCol();
        char symbol = move.getPlayer().getSymbol();

        HashMap<Character,Integer> colhm = colWisehm.get(col);
        if(colhm.containsKey(symbol)){
            colhm.put(symbol,colhm.get(symbol)+1);
            if(colhm.get(symbol) == dimension){
                return true;
            }
        }else{
            colhm.put(symbol,1);
        }
        return false;
    }
}
