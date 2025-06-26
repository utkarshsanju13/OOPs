package LLDRevisionScaler.TicTacToe.model;

public class Cell {

    private int row;
    private int col;
    private Player player;
    private CellStatus cellStatus;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.cellStatus = CellStatus.EMPTY;
    }

    public Cell(Cell cell){
        this.row = cell.getRow();
        this.col = cell.getCol();
        this.cellStatus = cell.getCellStatus();
        this.player = cell.getPlayer();
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setCellStatus(CellStatus cellStatus) {
        this.cellStatus = cellStatus;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public Player getPlayer() {
        return player;
    }

    public CellStatus getCellStatus() {
        return cellStatus;
    }

    public void displayCell() {

        if(this.getCellStatus().equals(CellStatus.EMPTY)){
            System.out.print("| "+ "|");
        }else{
            System.out.print("|"+this.getPlayer().getSymbol()+"|");
        }
    }
}
