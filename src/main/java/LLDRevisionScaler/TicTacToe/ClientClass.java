package LLDRevisionScaler.TicTacToe;

import LLDRevisionScaler.TicTacToe.controller.GameController;
import LLDRevisionScaler.TicTacToe.model.*;
import LLDRevisionScaler.TicTacToe.service.strategy.WinnigStrategy.ColumWinningStategy;
import LLDRevisionScaler.TicTacToe.service.strategy.WinnigStrategy.DiagonalWinningStrategy;
import LLDRevisionScaler.TicTacToe.service.strategy.WinnigStrategy.RowWinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientClass {

    public static void main(String[] args) {

        GameController gameController = new GameController();
        Scanner sc = new Scanner(System.in);
        List<Player> listofPlayers = new ArrayList<>();
        int playerIndx = 1;
        System.out.println("Welcome to the tic-tac-toe Game");
        System.out.println("Enter the dimesnion of the board....");
        int dimension = sc.nextInt();
        int numberofPlayers = dimension - 1;
        System.out.println("Do you want to play with bot..enter 1 for yes and no for 2");
        int botchoice = sc.nextInt();
        if(botchoice == 1){
            listofPlayers.add( new Bot(playerIndx++,"Chiiti",
                    '$', PlayerType.BOT, BotDifficultyLevel.EASY));
            numberofPlayers--;
        }

        while(numberofPlayers > 0){
            System.out.println("Please enter the Player Details");
            System.out.println("enter the name");
            String name = sc.next();
            System.out.println("Please enter the symbol");
            char symbol = sc.next().charAt(0);
            listofPlayers.add(new Player(playerIndx++,name,symbol,PlayerType.HUMAN));
            numberofPlayers--;
        }


        //create the game
        Game game = gameController.createGame(dimension,listofPlayers,
                List.of(new RowWinningStrategy(dimension),new ColumWinningStategy(dimension),
                        new DiagonalWinningStrategy(dimension)));

        int playerMoveIndx = -1;
        System.out.println("Initial board..");
        gameController.displayBoard(game);

        while(game.getGameState().equals(GameState.IN_PROGRESS)){
            playerMoveIndx++;
            playerMoveIndx = playerMoveIndx % listofPlayers.size();
            Player currentPlayer = listofPlayers.get(playerMoveIndx);
            Move lastMove = gameController.makeMove(game,currentPlayer);
            game.getMoves().add(lastMove);
            game.getBoards().add(new Board(game.getCurrentboard()));

            if(currentPlayer.getPlayerType().equals(PlayerType.HUMAN)){
                System.out.println("Do you want to undo the move .. type y or n");
                String ch = sc.next();
                if(ch.equalsIgnoreCase("y")){
                    game.getMoves().remove(game.getMoves().size() -1);
                    game.getBoards().remove(game.getBoards().size() -1);
                    game.setCurrentboard(new Board(game.getBoards().get(game.getBoards().size()-1)));
                    lastMove = gameController.makeMove(game,currentPlayer);
                    game.getMoves().add(lastMove);
                    game.getBoards().add(new Board(game.getCurrentboard()));
                }
            }

            System.out.println("Current Board");
            gameController.displayBoard(game);

            boolean checkWinner = gameController.checkWinner(game, lastMove);
            if(checkWinner) {
                System.out.println(lastMove.getPlayer().getName() + "is winner");
                break;
            }

            if(game.getMoves().size() == game.getCurrentboard().getDimension()
                    * game.getCurrentboard().getDimension()){
                game.setGameState(GameState.DRAW);
                System.out.println("Game is draw");
                break;
            }

            System.out.println("Do you want to replay..enter Y or N");
            String replay = sc.next();
            if(replay.equalsIgnoreCase("Y")){
                gameController.replay(game);
            }
        }
    }
}
