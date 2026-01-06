/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        int maxSum = Integer.MIN_VALUE, currentLevel=1;
        int resultLevel=0;
        q.add(root);

        while(!q.isEmpty()){
           int n = q.size(); 
           int sum=0;
          
          //traversing all elements of current level
           while(n-->0){
               TreeNode curr = q.poll();
               sum += curr.val;
               
               if(curr.left != null) q.add(curr.left);
               if(curr.right != null) q.add(curr.right);

               
           }
            if(sum > maxSum){
            maxSum = sum;
            resultLevel = currentLevel;
           
        }
         currentLevel++;


        }

       

        return resultLevel;
        
    }
}