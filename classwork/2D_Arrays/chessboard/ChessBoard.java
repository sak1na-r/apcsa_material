public class ChessBoard{
    public static void main(String[] args){
        String[][] chessBoard = new String[8][8];

        String[] firstAndLastRow = {"Rook", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight", "Rook"};

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == 0 || i == 7) {
                    chessBoard[i][j] = firstAndLastRow[j];
                    } else if (i == 1 || i == 6) {
                    chessBoard[i][j] = "Pawn";
                    } else {
                    chessBoard[i][j] = "-";
                }
            }
        }

        print(chessBoard);
    }
    
    public static void print(String[][] array){
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++) {
                System.out.print(array[r][c] + "\t");
            }
            System.out.println();
        }
    }


}
