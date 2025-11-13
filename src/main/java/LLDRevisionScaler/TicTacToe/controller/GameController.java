package LLDRevisionScaler.TicTacToe.controller;

import LLDRevisionScaler.TicTacToe.model.*;
import LLDRevisionScaler.TicTacToe.service.strategy.WinnigStrategy.WinningStrategy;

import java.util.List;

public class GameController {

    public Game createGame(int dimension, List<Player> playerList, List<WinningStrategy> winningStrategies){
        return Game.builder()
                .setDimension(dimension)
                .setPlayers(playerList)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public void displayBoard(Game game){
        game.getCurrentboard().display();
    }

    public void displayBoardOnly(Board board){
        board.display();
    }

    public Move makeMove(Game game,Player player){
        return player.makeMove(game,player);
    }


    public boolean checkWinner(Game game, Move lastMove) {
        boolean checkWinner = false;
        for(WinningStrategy strategy : game.getWinningStrategies()){
            checkWinner = strategy.checkWinner(game,lastMove);
            if(checkWinner){
                game.setGameState(GameState.WINNER);
                break;
            }
        }

        return checkWinner;
    }

    public void replay(Game game) {

        List<Board> boards = game.getBoards();
        for(int i = 0 ; i < boards.size(); i++){
            System.out.println(i+1 + "the move: BOARD" );
            displayBoardOnly(boards.get(i));
        }
    }
}
