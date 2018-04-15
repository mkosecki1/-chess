public class Board {
    public final static int MIN_INDEX = 0;
    public final static int MAX_INDEX = 7;
    Figure[][] board = new Figure[8][];

    public Board() {
        for (int n = 0; n < 8; n++) {
            board[n] = new Figure[8];
        }
    }

    public Figure getFigure(int x, int y) {
        return board[x][y];
    }

    public void setFigure(Figure figure, int x, int y) {
        board[x][y] = figure;
    }

    public String toString() {
        String result = "";
        for(int n = MIN_INDEX; n <= MAX_INDEX; n++) {
            result += "|";
            for(int k = MIN_INDEX; k <= MAX_INDEX; k++) {
                if(board[n][k] == null) {
                    result += "  ";
                } else {
                    result += (board[n][k]).getColor().equals(Figure.BLACK) ? "b" : "w";
                    result += (board[n][k]) instanceof Pawn ? "P" : "";
                    result += (board[n][k]) instanceof Bishop ? "B" : "";
                    result += (board[n][k]) instanceof Knight ? "KN" : "";
                    result += (board[n][k]) instanceof Rook ? "R" : "";
                    result += (board[n][k]) instanceof Queen ? "Q" : "";
                    result += (board[n][k]) instanceof King ? "K" : "";
                }
                result += "|";
            }
            result += "\n";
        }
        return result;
    }
}
