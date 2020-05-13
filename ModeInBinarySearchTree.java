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
    int max = 0;
    public int[] findMode(TreeNode root) {
      HashMap<Integer,Integer> map = new HashMap<>();  
      dfs(root,map);
        ArrayList<Integer> res = new ArrayList<>();
        for(int key: map.keySet()){
            if(map.get(key) == max){
                res.add(key);
            }
        }
        int [] result = new int[res.size()];
        for(int i = 0;i < res.size(); i++){
            result[i] = res.get(i);
        }
        return result;  
    }
    public void dfs(TreeNode root, HashMap<Integer,Integer> map){
        if(root == null)return;
        Integer value = map.getOrDefault(root.val,0)+1;
        max = Math.max(max,value);
        map.put(root.val,value);
        dfs(root.left,map);
        dfs(root.right,map); 
    }
}