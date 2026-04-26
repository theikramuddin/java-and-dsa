public class nQueensProblem {
    public static boolean isSafe(char board[][], int row, int col) {
        // Vertical Up
        for (int i = row-1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Diagonal Left Up
        for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Diagonal Right Up
        for (int i = row-1, j = col+1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static boolean nQueens(char board[][], int row) {
        // Basecase
        if (row == board.length) {
            // printBoard(board);
            // Count Total Ways
            count++;
            return true;
        }

        // Column Loop
        for (int j = 0; j < board.length; j++) {
            // Check it is safe place or not!
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';

                // Function Call
                if (nQueens(board, row + 1)) {
                    return true;
                }

                // Backtraking Step
                board[row][j] = 'X';
            }

        }

        return false;
    }

    public static void printBoard(char board[][]) {
        System.out.println("...............Chess Board...............");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;

    public static void main(String[] args) {

        int n = 5;
        char board[][] = new char[n][n];

        // Initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        // Function Call
        if (nQueens(board, 0)) {
            System.out.println("Solution is possible");
            printBoard(board);
        } else {
            System.out.println("Solution is not possible");
        }

        // Print Total Ways
        // System.out.println("Total Ways is: "+ count);
    }
}
