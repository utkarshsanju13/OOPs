package LLDRevisionScaler.TicTacToe.model;

import LLDRevisionScaler.TicTacToe.service.strategy.BotPlayingStrategy.BotPlayingStrategy;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private int dimension;
    private List<List<Cell>> matrix;


    public Board(int dimension) {
        this.dimension = dimension;
        this.matrix = new ArrayList<>();

        for(int i = 0; i < dimension; i++) {
            matrix.add(new ArrayList<>());
            for(int j = 0; j < dimension; j++) {
                matrix.get(i).add(new Cell(i,j));
            }
        }
    }

    public Board(Board board){
        this.dimension = board.getDimension();
        this.matrix = new ArrayList<>();
        for(List<Cell> row : board.getMatrix()) {
            List<Cell> newRow = new ArrayList<>();
            for(Cell cell : row) {
                newRow.add(new Cell(cell));
            }
            matrix.add(newRow);
        }
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public List<List<Cell>> getMatrix() {
        return matrix;
    }

    public void setMatrix(List<List<Cell>> matrix) {
        this.matrix = matrix;
    }

    public void display() {

        for(List<Cell> row : this.getMatrix()){
            for(Cell cell : row){
                cell.displayCell();
            }
            System.out.println();
        }
    }
}
