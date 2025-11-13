package LLDRevisionScaler.TicTacToe.model;

import LLDRevisionScaler.TicTacToe.service.strategy.BotPlayingStrategy.BotPlayingFactory;
import LLDRevisionScaler.TicTacToe.service.strategy.BotPlayingStrategy.BotPlayingStrategy;
import LLDRevisionScaler.TicTacToe.service.strategy.BotPlayingStrategy.EasyBotPlayingStrategy;

public class Bot extends Player {

    private BotDifficultyLevel botDifficultyLevel;

    public Bot(int id, String name, char symbol, PlayerType playerType,BotDifficultyLevel botDifficultyLevel) {
        super(id,name,symbol,playerType);
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    @Override
    public Move makeMove(Game game, Player player) {
        BotPlayingStrategy strategy = BotPlayingFactory.getBotPlayingStrategy(botDifficultyLevel);
        return  strategy.makeMove(game.getCurrentboard(),player);
    }
}
