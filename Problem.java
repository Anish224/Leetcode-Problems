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
        
        List<String> list = new ArrayList<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        Queue<String> str = new LinkedList<>();
        if(root == null)return list;
        q.offer(root);
        str.offer("");
        while(!q.isEmpty()){
            int size = q.size();
            for(int i =0;i<size;i++){
                TreeNode node = q.poll();
                String curStr = str.poll();
                
                if(node.left == null && node.right== null) list.add(curStr + node.val);
                if(node.left!=null){
                    q.add(node.left);
                    str.add(curStr+node.val+"->");
                    
                }
                if(node.right!=null){
                    q.add(node.right);
                    str.add(curStr+node.val+"->");
                }
                
                
                
            }   
            
        }
        return list;

        }
        
        
        
    }