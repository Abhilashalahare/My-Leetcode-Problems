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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
             List<List<Integer>> a =new ArrayList<>();
        if(root==null) return a;
      
        // Your code here
        Deque<TreeNode> q = new LinkedList<>();
        q.add(root);
          boolean reverse = false;

        
        while(q.isEmpty() == false){
            int n=q.size();
            List<Integer> t = new ArrayList<>();
            
            for(int i=0; i<n; i++){
               if(!reverse){
                TreeNode curr = q.removeFirst(); //remove = removefirst int deque
                t.add(curr.val);
                if(curr.left != null) q.addLast(curr.left);//add = addLast
                if(curr.right != null) q.addLast(curr.right);
               }else{
                //rev
                TreeNode curr = q.removeLast();
                t.add(curr.val);

                if(curr.right != null) q.addFirst(curr.right);
                if(curr.left != null) q.addFirst(curr.left);

               }
            }
            a.add(t);
            reverse = !reverse;
         
        }
        return a;
    }
}