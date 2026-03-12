import java.util.Scanner;

public class Game_tic_tac_toe {
    public static void main(String[] args) {
        char[][] board= new char[3][3];
        for (int i=0;i< board.length;i++){
            for (int j=0;j<board[i].length;j++){
                board[i][j]=' ';
            }
        }
        char player='X';
        boolean gameOver=false;
        Scanner sc=new Scanner(System.in);
        while(!gameOver){
            printBoard(board);
            System.out.println("player"+player+"enter:");
            int col=sc.nextInt();
            int row=sc.nextInt();
            System.out.println();

            if(board[row][col]==' '){
                board[row][col]=player;
                gameOver=haveWon(board,player);
                if(gameOver){
                    System.out.println("player"+player+"has won");
                }else{
                    player=(player=='X')?'0':'X';
                }
            }else{
                System.out.println("Invalid move. Try again");
            }
        }
   printBoard(board);
    }

    private static boolean haveWon(char[][] board, char player) {
        for (int i=0;i< board.length;i++){
            if(board[i][0]==player&& board[i][1]==player&& board[i][2]==player){
                return true;
            }
        }
        for (int j=0;j< board[0].length;j++){
            if(board[0][j]==player&& board[1][j]==player&& board[2][j]==player){
                return true;
            }
        }
        // for diagonal check
        if(board[0][0]==player&&board[1][1]==player&&board[2][2]==player){
            return true;
        }
        return false;
    }

    private static void printBoard(char[][] board) {
        for (int i=0;i< board.length;i++){
            for (int j=0;j<board[i].length;j++){
                System.out.print(board[i][j]+"|");
            }
            System.out.println();
        }
    }
}
