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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> qu=new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty()){
            int size=qu.size();
            
            List<Integer> sub=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=qu.poll();
                if(node!=null){
                sub.add(node.val);
                qu.add(node.left);
                qu.add(node.right);
            }
            }
            if(sub.size()>0){
                res.add(sub);
            }

        }
      return res;
        
    }
}
