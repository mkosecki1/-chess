import org.junit.Assert;
import org.junit.Test;

public class ChessTestSuite {
    @Test
    public void testCheckersBuilder() {
        //Given
        Chess chess = new Chess.ChessBuilder()
                .FirstPlayer("Maciek")
                .SecondPlayer("Ola")
                .Figure(FigureFactory.ROOK, Figure.WHITE, 0, 0)
                .Figure(FigureFactory.HORSE, Figure.WHITE, 0, 1)
                .Figure(FigureFactory.BISHOP, Figure.WHITE, 0, 2)
                .Figure(FigureFactory.QUEEN, Figure.WHITE, 0, 3)
                .Figure(FigureFactory.KING, Figure.WHITE, 0, 4)
                .Figure(FigureFactory.PAWN, Figure.WHITE, 6, 7)
                .Figure(FigureFactory.BISHOP, Figure.WHITE, 0, 5)
                .Figure(FigureFactory.HORSE, Figure.WHITE, 0, 6)
                .Figure(FigureFactory.ROOK, Figure.WHITE, 0, 7)
                .Figure(FigureFactory.PAWN, Figure.WHITE, 1, 0)
                .Figure(FigureFactory.PAWN, Figure.WHITE, 1, 1)
                .Figure(FigureFactory.PAWN, Figure.WHITE, 1, 2)
                .Figure(FigureFactory.PAWN, Figure.WHITE, 1, 3)
                .Figure(FigureFactory.PAWN, Figure.WHITE, 1, 4)
                .Figure(FigureFactory.PAWN, Figure.WHITE, 1, 5)
                .Figure(FigureFactory.PAWN, Figure.WHITE, 1, 6)
                .Figure(FigureFactory.PAWN, Figure.WHITE, 1, 7)
                .Figure(FigureFactory.ROOK, Figure.BLACK, 7, 7)
                .build();
        System.out.println(chess.getBoard());

        //When
        Figure figureOne = chess.getBoard().getFigure(0, 0);
        Figure figureTwo = chess.getBoard().getFigure(6, 7);
        Figure figureThree = chess.getBoard().getFigure(0, 1);
        Figure figureFour = chess.getBoard().getFigure(3, 3);

        //Then
        Assert.assertEquals(Figure.WHITE, figureOne.getColor());
        Assert.assertEquals(Pawn.class, figureTwo.getClass());
        Assert.assertEquals(Horse.class, figureThree.getClass());
        Assert.assertNull(figureFour);
    }

}