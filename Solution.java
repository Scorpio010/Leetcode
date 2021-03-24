package leetcode.p94;

import java.util.ArrayList;
import java.util.List;
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
         inorderList.clear();
         inorder(root);
         return inorderList;
    }
    private List<Integer> inorderList = new ArrayList<>();
    private void inorder(TreeNode root){
        if (root == null){
            return;
        }
        inorder(root.left);
        inorderList.add(root.val);
        inorder(root.right);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.inorderTraversal(null);
        solution.inorderTraversal(null);
    }
}
