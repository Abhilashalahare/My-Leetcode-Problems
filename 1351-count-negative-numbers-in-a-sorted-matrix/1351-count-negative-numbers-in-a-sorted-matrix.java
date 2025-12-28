class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        int row = 0;
        int col = n - 1;
        int count = 0;

//         Because rows and columns are sorted decreasingly:

// Start from top-right corner.

// If the current number is negative, then everything below it in that column is also negative.

// So add all remaining elements in that column.

// Move left.

// If the current number is non-negative, move down.

// This avoids scanning every element.

        while (row < m && col >= 0) {
            if (grid[row][col] < 0) {
                // All elements below in this column are negative
                count += (m - row);
                col--; // move left
            } else {
                row++; // move down
            }
        }
        return count;
    }
}
