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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
          List<List<Integer>> a =new ArrayList<>();
          List<List<Integer>> a2 = new ArrayList<>();
        if(root==null) return a;
        // Your code here
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(q.isEmpty() == false){
            int n=q.size();
            List<Integer> t = new ArrayList<>();
            
            for(int i=0; i<n; i++){
                TreeNode temp = q.remove();
                t.add(temp.val);
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }

            a.add(t);
         
        }

        for(int i=a.size()-1; i>=0; i--){
            a2.add(a.get(i));
        }
        return a2;
    }
}