package LLDRevisionScaler.TicTacToe.service.strategy.WinnigStrategy;

import LLDRevisionScaler.TicTacToe.model.Game;
import LLDRevisionScaler.TicTacToe.model.Move;
import LLDRevisionScaler.TicTacToe.model.Player;

public interface WinningStrategy {

    boolean checkWinner(Game game, Move move);
}
