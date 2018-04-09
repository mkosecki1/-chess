public class FigureFactory {
    public static final String PAWN="PAWN";
    public static final String KNIGHT="KNIGHT";
    public static final String BISHOP="BISHOP";
    public static final String ROOK="ROOK";
    public static final String QUEEN="QUEEN";
    public static final String KING="KING";

    public static Figure makeFigure(String figureType, String color) {
        if (figureType.equals(PAWN)) {
            return new Pawn(color);
        } else if (figureType.equals(KNIGHT)) {
            return new Queen(color);
        } else if (figureType.equals(BISHOP)) {
            return new Queen(color);
        } else if (figureType.equals(ROOK)) {
            return new Queen(color);
        } else if (figureType.equals(QUEEN)) {
            return new Queen(color);
        } else if (figureType.equals(KING)) {
            return new Queen(color);
        } else {
            throw new IllegalStateException("Illegal type of figure");
        }
    }
}
