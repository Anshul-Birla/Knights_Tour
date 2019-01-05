
/**
 * Write a description of class KnightsTour here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
/*
  This program will start the knight chess piece at a corner of the
  board and attempt to move to all 64 squares.  This program
  will use a random number generator to attempt a move of type 1-8.
  The possible moves are categorized as follows:

  move 1:  +1 to the right, -2 up, a negative move to go up in the grid
  move 2:  +2 to the right, -1 up
  move 3:  +2 to the right, +1 down
  move 4:  +1 to the right, +2 down
  move 5:  -1 to the left, +2 down
  move 6:  -2 to the left, +1 down
  move 7:  -2 to the left, -1 up
  move 8:  -1 to the left, -2 up

  The program will move the knight until all 64 squares have been
  hit (extremely rare), or the piece gets stuck.  The program will
  print out the board, with numbers ranging from 1-64 for the order
  in which the squares were visited.
*/
class KnightsTour
{
  protected int[] myHorizMove = {0, 1, 2, 2, 1, -1, -2, -2, -1};
  protected int[] myVertMove = {0, -2, -1, 1, 2, 2, 1, -1, -2};
  protected int[][] masterBoard;
  private int lastMoveX;
  private int lastMoveY;
  
  public KnightsTour()
  {
      masterBoard = new int[9][9];
      
      lastMoveX = 1;
      lastMoveY = 1;
      move(1);
}
   public boolean checkMove(int num)
   {
       boolean check = true;
       int newX = lastMoveX + myHorizMove[num];
       int newY = lastMoveY + myVertMove[num];
       
       if ( newX> 0 && newX <9)
            if( newY > 0 && newY <9)
                check = true;
       
       if(masterBoard[newX][newY] != 0)
        check = false;
       
        return check;
       
    }
    
    public void move(int number)
    {
        masterBoard[lastMoveX][lastMoveY] = number;
    }
}