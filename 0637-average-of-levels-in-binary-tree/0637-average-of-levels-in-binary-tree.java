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
    public List<Double> averageOfLevels(TreeNode root) {
      
       List<Double> ans = new ArrayList<>();
       Queue<TreeNode> q = new LinkedList<>();
       q.offer(root);
       while(!q.isEmpty()){
         int sizeAtEachLevel = q.size();
          double sumAtLevelsEach = 0;

        for(int i=0; i<sizeAtEachLevel; i++){
            TreeNode curr = q.poll();
            sumAtLevelsEach += curr.val;

            if(curr.left != null) q.offer(curr.left);
            if(curr.right != null) q.offer(curr.right);
        }
        sumAtLevelsEach = sumAtLevelsEach/sizeAtEachLevel;
        ans.add(sumAtLevelsEach);
       }
       
       return ans;
       


    }
}