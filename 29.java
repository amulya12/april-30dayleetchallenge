/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
   int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
       if (root!=null) maxPath(root);
        return max;
    }
    public void maxPath(TreeNode root) {
        int current = root.val;
          max = Math.max(max, current);
        if (root.right!=null){
            maxPath(root.right);
            root.val = Math.max(root.val, current+root.right.val);
            max = Math.max(max, current+root.right.val);
        } 
        if (root.left!=null) {
            maxPath(root.left);
            root.val = Math.max(root.val, current+root.left.val);
            max = Math.max(max, current+root.left.val);
        }
        if (root.right!=null && root.left!=null){
          max = Math.max(max, current+root.left.val+root.right.val);
		}
    }
}