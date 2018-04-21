public class FigureFactory {
    public static final String PAWN="PAWN";
    public static final String HORSE="HORSE";
    public static final String BISHOP="BISHOP";
    public static final String ROOK="ROOK";
    public static final String QUEEN="QUEEN";
    public static final String KING="KING";

    public static Figure makeFigure(String figureType, String color) {
        switch (figureType) {
            case PAWN:
                return new Pawn(color);
            case HORSE:
                return new Horse(color);
            case BISHOP:
                return new Bishop(color);
            case ROOK:
                return new Rook(color);
            case QUEEN:
                return new Queen(color);
            case KING:
                return new King(color);
            default:
                throw new IllegalStateException("Illegal type of figure");
        }
    }
}
