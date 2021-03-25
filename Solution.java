package leetcode.p572;

public class Solution {
    //判断是否为另一个树的子树
    public boolean isSubtree(TreeNode s, TreeNode t) {
     if (t==null){
         return true;
     }
     if (s==null){
         return false;
     }
     return isSubtree(s.left,t)||isSubtree(s.right,t)||isSametree(s,t);
    }
    public boolean isSametree(TreeNode s, TreeNode t){
        if (s==null&&t==null){
            return true;
        }
        if (s==null||t==null) return false;
        if (s.val!=t.val) return false;
        return isSametree(s.left,t.left)&&isSametree(s.right,t.right);
    }
}
