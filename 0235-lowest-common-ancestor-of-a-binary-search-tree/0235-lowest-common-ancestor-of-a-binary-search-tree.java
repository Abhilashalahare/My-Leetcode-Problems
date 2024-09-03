/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q){
            return root;
        }
        

        TreeNode lft = lowestCommonAncestor(root.left,p,q);
        TreeNode rht =  lowestCommonAncestor(root.right,p,q); 

        if(lft == null){
            return rht;
        }
        if(rht==null){
            return lft;
        }
        return root;
    }
}