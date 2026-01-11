class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0)
            return 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int[] height = new int[m];
        // for 1st row, col0 to last col  -- 0th row
        for (int i = 0; i < m; i++) {
            height[i] = (matrix[0][i] == '1') ? 1 : 0;
        }
        int maxA = MAH(height);//find maxArea of 0th row
        // start from row 2 -- 1st row
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == '0')
                    height[j] = 0;
                else
                    height[j] += 1;
            }
            maxA = Math.max(maxA, MAH(height));
        }
        return maxA;
    }


     public int MAH(int[] heights) {
        int n = heights.length;
        int[] right = NSR(heights);
        int[] left = NSL(heights);
        int[] width = new int[n];
        for (int i = 0; i < n; i++)
            width[i] = right[i] - left[i] - 1;
        int max_area = 0;

        for (int i = 0; i < n; i++) {
            int a = width[i] * heights[i];
            if (max_area < a)
                max_area = a;
        }
        return max_area;
    }

       public int[] NSR(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
       
        int[] right = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if (st.empty()) {
                right[i] = n;
            } else {
                while (!st.empty() && heights[st.peek()] >= heights[i])
                    st.pop();
                if (st.empty())
                    right[i] =n;
                else
                    right[i] = st.peek();
            }
            st.push(i);
        }
        return right;
    }

    public int[] NSL(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
      
        int[] left = new int[n];
        for (int i = 0; i < n; i++) {
            if (st.empty()) {
                left[i] =-1;
            } else {
                while (!st.empty() && heights[st.peek()] >= heights[i])
                    st.pop();
                if (st.empty())
                    left[i] = -1;
                else
                    left[i] = st.peek();
            }
            st.push(i);
        }
        return left;
    }
}