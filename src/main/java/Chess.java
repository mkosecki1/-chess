public class Chess {
    private final Board board;
    private final String playerOne;
    private final String playerTwo;

    private Chess(Board board, String playerOne, String playerTwo) {
        this.board = board;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public Board getBoard() {
        return board;
    }

    public String getPlayerOne() {
        return playerOne;
    }

    public String getPlayerTwo() {
        return playerTwo;
    }

    public static class ChessBuilder {
        private Board board = new Board();
        private String firstPlayer = "";
        private String secondPlayer = "";

        public ChessBuilder FirstPlayer(String firstPlayer) {
            this.firstPlayer = firstPlayer;
            return this;
        }

        public ChessBuilder SecondPlayer(String secondPlayer) {
            this.secondPlayer = secondPlayer;
            return this;
        }

        public ChessBuilder Figure(String figureType, String figureColor, int x, int y) {
            if (x > Board.MAX_INDEX || x < Board.MIN_INDEX ||
                    y > Board.MAX_INDEX || y < Board.MIN_INDEX) {
                throw new IllegalStateException("You must put a figure on board!");
            }
            if (board.getFigure(x, y) == null) {
                board.setFigure(FigureFactory.makeFigure(figureType, figureColor), x, y);
            } else {
                throw new IllegalStateException("On position " + x + "," + y + " is already another figure");
            }
            return this;
        }

        public Chess build() {
            if (firstPlayer.length() == 0) {
                throw new IllegalStateException("There is no first player");
            }
            if (secondPlayer.length() == 0) {
                throw new IllegalStateException("There is no second player Two specified");
            }
            boolean white = false, black = false;
            for(int x = Board.MIN_INDEX; x <= Board.MAX_INDEX; x++) {
                for(int y = Board.MIN_INDEX; y <= Board.MAX_INDEX; y++) {
                    Figure figure = board.getFigure(x, y);
                    if (figure != null) {
                        if (figure.getColor().equals(Figure.BLACK)) {
                            black = true;
                        } else {
                            white = true;
                        }
                    }
                }
            }
            if (!(black && white)) {
                throw new IllegalStateException("There are no figures of both colors on the board!");
            }
            return new Chess(board, firstPlayer, secondPlayer);
        };
    }
}
