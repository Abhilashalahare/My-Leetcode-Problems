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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> a =new ArrayList<>();
        if(root==null) return a;
        // Your code here
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(q.isEmpty() == false){
            int n=q.size();
            int t = -1;
            
            for(int i=0; i<n; i++){
                TreeNode temp = q.remove();
                t = temp.val;//size of queue tak loop chlra h, always t = last value
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }

            a.add(t);
         
        }
        return a;
    }
}