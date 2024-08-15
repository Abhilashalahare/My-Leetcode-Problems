class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int str = 0;
        int stc = 0;
        int er = n-1;
        int ec = m-1;
        while(arr.size()<m*n){
            //top->st row fix
            for(int i=str; i<=ec && arr.size()<m*n; i++){
                arr.add(matrix[str][i]);
            }
            //right->last col fix
            for(int i=str+1; i<=er && arr.size()<m*n; i++){
               arr.add(matrix[i][ec]);
            }

            //bottom->last row fix
            for(int i=ec-1; i>=stc && arr.size()<m*n; i--){
                if(stc==ec){
                    break;
                }
                arr.add(matrix[er][i]);
            }

            //left->st col fix
            for(int i=er-1; i>=str+1 && arr.size()<m*n; i--){
                if(str==er){
                    break;
                }
                arr.add(matrix[i][stc]);
            }

            stc++;
            str++;
            ec--;
            er--;

    
        }

        return arr;
    }
}