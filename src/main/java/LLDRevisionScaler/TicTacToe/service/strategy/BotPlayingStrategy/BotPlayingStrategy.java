package LLDRevisionScaler.TicTacToe.service.strategy.BotPlayingStrategy;

import LLDRevisionScaler.TicTacToe.model.Board;
import LLDRevisionScaler.TicTacToe.model.Move;
import LLDRevisionScaler.TicTacToe.model.Player;

public interface BotPlayingStrategy {

    Move makeMove(Board board, Player player);
}
