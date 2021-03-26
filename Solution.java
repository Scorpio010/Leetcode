package leetcode.p101;
 class TreeNode {
   public int val;
   public TreeNode left;
   public TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class Solution {
    public boolean isSymmetric(TreeNode root) {
          return ismirrorTree(root,root);
    }
    public boolean ismirrorTree(TreeNode p,TreeNode q){
        if (p==null&&q==null){
            return true;
        }
        if (p==null||q==null){
            return false;
        }
       return p.val==q.val&&ismirrorTree(p.left,q.right)&&ismirrorTree(p.right,q.left);
    }
}
