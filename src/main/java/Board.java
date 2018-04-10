import java.util.Arrays;

public class Board {
    public final static int MIN_INDEX = 0;
    public final static int MAX_INDEX = 9;
    Figure[][] board = new Figure[10][];

    public Board() {
        for (int n = 0; n < 10; n++) {
            board[n] = new Figure[10];
        }
    }

    public Figure getFigure(int x, int y) {
        return board[x][y];
    }

    public void setFigure(Figure figure, int x, int y) {
        board[x][y] = figure;
    }

    @Override
    public String toString() {
        return "Board{" +
                "board=" + Arrays.toString(board) +
                '}';
    }
}
