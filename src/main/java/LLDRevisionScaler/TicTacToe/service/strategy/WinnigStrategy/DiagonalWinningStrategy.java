package LLDRevisionScaler.TicTacToe.service.strategy.WinnigStrategy;

import LLDRevisionScaler.TicTacToe.model.Game;
import LLDRevisionScaler.TicTacToe.model.Move;
import LLDRevisionScaler.TicTacToe.model.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DiagonalWinningStrategy implements WinningStrategy {

    private int dimension;

    HashMap<Character,Integer> leftdiagonalWisehm = new HashMap<>();
    HashMap<Character,Integer> rightdiagonalWisehm = new HashMap<>();

    public DiagonalWinningStrategy(int dimension){
        this.dimension = dimension;
    }

    @Override
    public boolean checkWinner(Game game, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        char symbol = move.getPlayer().getSymbol();

        if(row == col){
            if(leftdiagonalWisehm.containsKey(symbol)){
                leftdiagonalWisehm.put(symbol, leftdiagonalWisehm.get(symbol)+1);
                if(leftdiagonalWisehm.get(symbol) == dimension){
                    return true;
                }
            }else{
                leftdiagonalWisehm.put(symbol,1);
            }
        }

        if((row + col) == dimension -1){
            if(rightdiagonalWisehm.containsKey(symbol)){
                rightdiagonalWisehm.put(symbol, rightdiagonalWisehm.get(symbol)+1);
                if(rightdiagonalWisehm.get(symbol) == dimension){
                    return true;
                }
            }else{
                rightdiagonalWisehm.put(symbol,1);
            }
        }

        return false;
    }
}
