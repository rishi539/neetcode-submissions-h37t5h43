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

public class Codec {

   
    public String serialize(TreeNode root) {
       if(root==null)return "";
       Queue<TreeNode> qu=new LinkedList<>();
       qu.add(root);
       StringBuilder sb=new StringBuilder("");
       while(!qu.isEmpty()){
        TreeNode curr=qu.poll();
        if(curr!=null)sb.append(curr.val + ",");
        else sb.append("#"+",");
        if(curr!=null){
            qu.add(curr.left);
            qu.add(curr.right);
        }
        

       } 
       return sb.toString();
    }

    public TreeNode deserialize(String data) {
        if (data == null || data.length() == 0) return null;
        String[] vals=data.split(",");
        if(vals[0].equals("#"))return null;
        Queue<TreeNode> qu=new LinkedList<>();
       TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        qu.add(root);
        int index=1;
        while(!qu.isEmpty()){
            TreeNode curr=qu.poll();
            if(!vals[index].equals("#")){
           curr.left= new TreeNode(Integer.parseInt(vals[index]));
           qu.add(curr.left);
            }
        
            index++;
            if(!vals[index].equals("#")){
                curr.right=new TreeNode(Integer.parseInt(vals[index]));
                qu.add(curr.right);
            }
            index++;
            
        }
        return root;
       
    }
}
