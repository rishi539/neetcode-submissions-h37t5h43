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
    public TreeNode invertTree(TreeNode cur) {
        if(cur==null)return null;
        
            TreeNode temp=cur.left;
            cur.left=cur.right;
            cur.right=temp;
            if(cur.left!=null)invertTree(cur.left);
            if(cur.right!=null)invertTree(cur.right); 
        
        return cur;
        
    }
}

