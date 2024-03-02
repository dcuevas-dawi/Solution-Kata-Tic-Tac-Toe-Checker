public class Solution {

    public static int isSolved(int[][] board) {

      // Check if player 1 won
      if((board[0][0] == 1 && board[0][1] == 1 && board[0][2] == 1) || 
        (board[1][0] == 1 && board[1][1] == 1 && board[1][2] == 1) || 
        (board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 1) || 
        (board[0][0] == 1 && board[1][0] == 1 && board[2][0] == 1) || 
        (board[0][1] == 1 && board[1][1] == 1 && board[2][1] == 1) || 
        (board[0][2] == 1 && board[1][2] == 1 && board[2][2] == 1) || 
        (board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1) || 
        (board[0][2] == 1 && board[1][1] == 1 && board[2][0] == 1)){
        return 1;
      }

      // Check if player 2 won
      if((board[0][0] == 2 && board[0][1] == 2 && board[0][2] == 2) || 
        (board[1][0] == 2 && board[1][1] == 2 && board[1][2] == 2) || 
        (board[2][0] == 2 && board[2][1] == 2 && board[2][2] == 2) || 
        (board[0][0] == 2 && board[1][0] == 2 && board[2][0] == 2) || 
        (board[0][1] == 2 && board[1][1] == 2 && board[2][1] == 2) || 
        (board[0][2] == 2 && board[1][2] == 2 && board[2][2] == 2) || 
        (board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2) || 
        (board[0][2] == 2 && board[1][1] == 2 && board[2][0] == 2)){
        return 2;
      }

      // Check if any position is set to 0
      for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
          if(board[i][j] == 0){
            return -1;
          }
        }
      }

      // When game is finished, return 0
      return 0;
      
    }
}
