class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum =0, minVal=Integer.MAX_VALUE;
       int cntNeg = 0;
        for (int i = 0; i < matrix.length; i++) { //rows
           
            for (int j = 0; j < matrix[0].length; j++) {
                  sum += Math.abs(matrix[i][j]);

                if (matrix[i][j] < 0) {
                    cntNeg++;
                    }
               minVal = Math.min(minVal, Math.abs(matrix[i][j])); 
            
                }
        }
    if(cntNeg%2 == 0) return sum;
    else{
        return sum - (2*minVal);   //sum me phle se vo value tha added, usko hatana h fir vahi value minus krna h isly 2 times eg -> min=2, cntneg=odd, sum was 2+3+4+5, now remove 2 and add -2, so -- 2 times 2 is subtracted from sum
    }

    

}}