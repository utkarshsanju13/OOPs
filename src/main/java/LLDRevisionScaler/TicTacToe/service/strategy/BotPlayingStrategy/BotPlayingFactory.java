package LLDRevisionScaler.TicTacToe.service.strategy.BotPlayingStrategy;

import LLDRevisionScaler.TicTacToe.model.BotDifficultyLevel;

public class BotPlayingFactory {

    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel difficulty) {
        switch (difficulty) {
            case EASY:
                return new EasyBotPlayingStrategy();
            default:
                throw new RuntimeException("Invalid difficulty");
        }
    }
}
