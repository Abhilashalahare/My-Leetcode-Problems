class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] row = new int[m];
        int[] col = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                  row[i] = 1;
                  col[j] = 1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
               }
               }
               

    }
}

// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int m = matrix.length;
//         int n = matrix[0].length;

//         int[][] temp = new int[m][n];

//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 temp[i][j] = matrix[i][j];
//             }
//         }

//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (matrix[i][j] == 0) {
//                     for (int k = 0; k < n; k++) {
//                         temp[i][k] = 0;  // zero out the entire row
//                     }
//                     for (int k = 0; k < m; k++) {
//                         temp[k][j] = 0;  // zero out the entire column
//                     }
//                 }
//             }
//         }

//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 matrix[i][j] = temp[i][j];
//             }
//         }

//     }
// }