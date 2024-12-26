class Solution {
   static List<List<String>> allSolutions = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
          char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.'; // Empty board
            }
        }
        allSolutions.clear(); // Clear previous results if any
        nQueens(board, 0);
        return allSolutions;
    }
    public static void nQueens(char[][] board, int row) {
        // Base case: all queens are placed
        if (row == board.length) {
            // Convert the board to a list of strings and add to solutions
            List<String> solution = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                solution.add(new String(board[i]));
            }
            allSolutions.add(solution);
            return;
        }

        // Try placing queen in each column
        for (int col = 0; col < board.length; col++) { //same row pe alg alg col pe dal k dekhna h Q ko agr safe h to
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                nQueens(board, row + 1);
                // Backtracking
                board[row][col] = '.';
            }
        }
    }

    

    public static boolean isSafe(char[][] board, int row, int col) {
        // Check vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // Check diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // Check diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }


}