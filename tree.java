import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.tree.TreeNode;
import java.util.ArrayList;

public class tree {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        inorder(root, res);
        return res;
    }

    public void inorder(TreeNode node, List<Integer> res) {
        if(node == null) {
            return;
        }
        inorder(node.left, res);
        res.add(node.val);
        inorder(node.right, res);
    }

    public TreeNode deleteNode(TreeNode root, int x) {
        if(root==null) {return root;}
        if(root.val > x) {root.left = deleteNode(root.left,x);} //go down left subtree
        else if(root.val<x) {root.right = deleteNode(root.right,x);} //go down right subtree
        else{
            if(root.left == null && root.right == null){
                return null; 
            }

            else if(root.left == null) {
                return root.right;
            }

            else if(root.right == null) {
                return root.left;
            }
            else{
                TreeNode replace = getSuccessor(root);
                root.val = replace.val;
                root.right = deleteNode(root.right, replace.val);

            }
        }
        return root;
    }

    public TreeNode getSuccessor(TreeNode curr) {
        curr = curr.right;
        while(curr != null && curr.left != null) {
            curr = curr.left;
        }
        //this gets left most node of the right subtree
        return curr;
    }
}

