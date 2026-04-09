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
    public int goodNodes(TreeNode root) {
        return dfs(root,root.val);
        
    }
    public int dfs(TreeNode root,int maxv){
        int res=0;
        if(root==null){
            return 0;
        }
        if(root.val>= maxv){
          res+=1;
        }
        
        maxv=Math.max(maxv,root.val);
        res+=dfs(root.left,maxv);
        res+=dfs(root.right,maxv);
        return res;


    }
}
