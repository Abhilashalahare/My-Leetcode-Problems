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

        if(root == null) return ans;

        q.add(root);

        while(!q.isEmpty()){
            double sum = 0;
            int n = q.size();

            for(int i=0; i<n; i++){
               TreeNode curr = q.poll();
               sum += curr.val;

               if(curr.left != null) q.offer(curr.left);
               if(curr.right != null) q.offer(curr.right);

            }

            ans.add(sum/n);
            
        }
        return ans;
    }
}