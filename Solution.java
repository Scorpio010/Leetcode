package leetcode.p110;
public class TreeNode {
    public int val;
    public leetcode.p94.TreeNode left;
    public leetcode.p94.TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, leetcode.p94.TreeNode left, leetcode.p94.TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Solution {
    //判断是否为平衡二叉树
    public boolean isBalanced(TreeNode root) {
       if (getheight(root)>=0) return true;
       else return false;

    }
    public int getheight(TreeNode root){
        if (root==null) return 0;
        int leftsubheight = getheight(root.left);
        int rightsubheight = getheight(root.right);
        if (leftsubheight>=0&&rightsubheight>=0&&Math.abs(leftsubheight-rightsubheight)<=1)
        return Integer.max(getheight(root.left),getheight(root.right))+1;
        else return -1;
    }
}
