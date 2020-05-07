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
    public boolean isCousins(TreeNode root, int x, int y) {
       if(root == null){return false;}
       Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            boolean A = false;
            boolean B = false;
        for(int i =0;i<size;i++){
            TreeNode node = q.poll();
            if(node.val == x) A = true;
            if(node.val == y) B = true;
            if(node.left!= null && node.right!=null){
                if(node.left.val == x && node.right.val == y){
                    return false;
                }
                if(node.left.val == y && node.right.val == x){
                    return false;
                }
            }
            if(node.left!=null){
                q.offer(node.left);
            }
            if(node.right!=null){
                q.offer(node.right);
            }
        }
        if(A && B){return true;}
            
        }
        
        
        return false;
        
        
        
        
    }
}