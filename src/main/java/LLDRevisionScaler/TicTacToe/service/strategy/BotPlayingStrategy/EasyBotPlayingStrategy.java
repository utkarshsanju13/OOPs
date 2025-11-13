package LLDRevisionScaler.TicTacToe.service.strategy.BotPlayingStrategy;

import LLDRevisionScaler.TicTacToe.model.*;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{

    @Override
    public Move makeMove(Board board, Player player) {

        for(List<Cell> row : board.getMatrix()){
            for(Cell cell: row){
                if(cell.getCellStatus().equals(CellStatus.EMPTY)){
                    cell.setCellStatus(CellStatus.FILLED);
                    cell.setPlayer(player);
                    return new Move(cell, player);
                }
            }
        }

        throw new RuntimeException("All cell are filled");
    }
}
