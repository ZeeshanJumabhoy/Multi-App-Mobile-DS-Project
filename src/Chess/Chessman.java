package Chess;
import java.util.ArrayList;

import Chess.Position;
import Chess.SideColor;



public abstract class Chessman {

    public SideColor color;
    public boolean notMoved;
    public Position pos;
    public int Value;

    public short imgSrc;

    abstract void loadImage() ;


    public abstract ArrayList<Position> GetMoves(Chessman[][] board);
}
