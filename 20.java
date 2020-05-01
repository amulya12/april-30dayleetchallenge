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
    private int i = 0;
    private int[] preorder;
    
    public TreeNode bstFromPreorder(int[] preorder) {
        this.preorder = preorder; 
        return getBST(Integer.MAX_VALUE);        
    }
    
    private TreeNode getBST(int max) {
        if (i > preorder.length - 1) {
            return null;
        }
        
        int rootVal = preorder[i];
        if (rootVal > max) {
            return null;
        }
        
        TreeNode root = new TreeNode(rootVal);
        i++;
        
        root.left = getBST(rootVal);
        root.right = getBST(max);
        
        return root;
    }
}