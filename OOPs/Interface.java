public class Interface {
    public static void main(String[] args) {
        Queen q1=new Queen();
        q1.moves();
    }
}
interface ChessPlayer
{
    void moves();
}
class Queen implements ChessPlayer
{
    public void moves()//must be public, if public keyword not writtern will be of type default
    {
        System.out.println("Moves up, down, left, right, diagonal(all 4 directions)");
    }
}
class Rook implements ChessPlayer
{
    public void moves()
    {
        System.out.println("Moves up, down, left, right");
    }
}
class King implements ChessPlayer
{
    public void moves()//must be public, if public keyword not writtern will be of type default
    {
        System.out.println("Moves up, down, left, right, diagonal(by one step)");
    }
}
