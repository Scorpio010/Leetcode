package leetcode.p236;

import java.util.Stack;

public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
 public class Solution{
    public  TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if (root==p||root==q) return root;
        if (root==null) return null;
        TreeNode left  = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if (left!=null&&right!=null) return root;
        else if (left!=null) return left;
        else if (right!=null) return right;
        else return null;
    }
 }
public class Solution2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         if (root==p||root==q) return root;
         if (root==null) return null;
         TreeNode cur=root;
         TreeNode last = null;
        Stack<TreeNode> stack = new Stack<>();
        while(cur!=null||!stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                cur = cur.left;
            }
        }
        TreeNode pop = stack.peek();
        if (pop.right==null||pop.right==last){

        }
    }
}
