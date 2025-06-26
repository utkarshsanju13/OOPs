package LLDRevisionScaler.TicTacToe.model;

import java.util.Scanner;

public class Player {

    private int id;
    private String name;
    private char symbol;
    private PlayerType playerType;

    public Player(int id, String name, char symbol, PlayerType playerType) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Move makeMove(Game game, Player player) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row to make move..");
        int row = sc.nextInt();
        System.out.println("Enter the col to make move");
        int col = sc.nextInt();

        Cell cell  = game.getCurrentboard().getMatrix().get(row).get(col);

        if(cell.getCellStatus().equals(CellStatus.EMPTY)){
            cell.setCellStatus(CellStatus.FILLED);
            cell.setPlayer(player);
            return new Move(cell, player);
        }

        throw new RuntimeException(("Cell is not empty"));
    }
}
