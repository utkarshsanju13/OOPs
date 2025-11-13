package LLDRevisionScaler.TicTacToe.model;

import LLDRevisionScaler.TicTacToe.service.strategy.WinnigStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Board currentboard;
    private List<Player> players;
    private List<Move> moves;
    private List<Board> boards;
    private GameState gameState;
    private int nextMovePlayedIndex;
    private List<WinningStrategy> winningStrategies;

    public Game(int dimension, List<Player> players,List<WinningStrategy> winningStrategies ) {
        this.currentboard = new Board(dimension);
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.moves = new ArrayList<>();
        this.boards = new ArrayList<>();
        this.gameState = GameState.IN_PROGRESS;
        this.nextMovePlayedIndex = 0;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private int dimension;
        private List<Player> players;
        private List<WinningStrategy>winningStrategies;

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return  this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return  this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return  this;
        }

        public void validate(){
            validateBotCount();
            validateSymbol();
        }

        public void validateBotCount(){

        }

        public void validateSymbol(){

        }

        public Game build(){
            validate();
            return  new Game(dimension,players,winningStrategies);
        }
    }

    public Board getCurrentboard() {
        return currentboard;
    }

    public void setCurrentboard(Board currentboard) {
        this.currentboard = currentboard;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public List<Board> getBoards() {
        return boards;
    }

    public void setBoards(List<Board> boards) {
        this.boards = boards;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextMovePlayedIndex() {
        return nextMovePlayedIndex;
    }

    public void setNextMovePlayedIndex(int nextMovePlayedIndex) {
        this.nextMovePlayedIndex = nextMovePlayedIndex;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }
}
