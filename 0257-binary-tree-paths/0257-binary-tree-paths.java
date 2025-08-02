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
    public List<String> binaryTreePaths(TreeNode root) {
          List<String> result=new ArrayList<>();
        if(root!=null){
            treePath(root,"",result);
        }
        return result;
    }

    public void treePath(TreeNode root,String path,List<String> order){
        if(root.left==null & root.right==null){
            order.add(path+root.val);
        }

        if(root.left!=null){
            treePath(root.left,path+root.val+"->",order);
        }

        if(root.right!=null){
            treePath(root.right,path+root.val+"->",order);
        }
    }
}