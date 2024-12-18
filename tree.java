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
        TreeNode root;
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

    //helper function for inorderTraversal
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

    //helper function for deleteNode
    public TreeNode getSuccessor(TreeNode curr) {
        curr = curr.right;
        while(curr != null && curr.left != null) {
            curr = curr.left;
        }
        //this gets left most node of the right subtree
        return curr;
    }

    public int min(TreeNode root) {
        TreeNode curr = root.left;
        while(curr.left != null) {
            curr = curr.left;
        }
        return curr.val;
    }

    public int max(TreeNode root) {
        TreeNode curr = root.right;
        while(curr.left != null) {
            curr = curr.right;
        }
        return curr.val;
    }

    public boolean isBalanced(TreeNode root) {
        if(root==null) {return true;}
        int lef = height(root.left);
        int righ = height(root.right);
        if(Math.abs(lef - righ) > 1) {
            return false;
        }
        else if (isBalanced(root.left) == false || isBalanced(root.right) == false) {
            return false;
        }   
        else{return true;}
    }

    //helper function for isBalanced
    public int height(TreeNode curr) {
        if(curr == null){
            return 0;
        }
        int leftH = height(curr.left);
        int rightH = height(curr.right);
        return Math.max(leftH, rightH);
    }

    public TreeNode sortedArrayToTree(int[] nums) {
        int n = nums.length;
        if(n == 0) {return null;}
        return sortHelper(nums, 0, n-1);
    }

    public TreeNode sortHelper(int[] nums, int s, int e) {
        if (s > e) { return null;}
        int mid = s + (e - s) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortHelper(nums, s, mid-1);
        node.right = sortHelper(nums, mid+1, e);
        return node;
    }
    
    //helper function that i tried to write lol
    /* public int height2(TreeNode root) {
        int leftSum = 0;
        int rightSum = 0;
        TreeNode curr = root;
        while(curr.right != null) {
            curr = curr.right;
            rightSum++;
        }
        while(curr.left != null){
            curr = curr.left;
            leftSum++;
        }
        int height = 0;
        if(0 <= Math.abs(leftSum-rightSum) && Math.abs(leftSum-rightSum) <= 1) {
            if((leftSum > rightSum) || leftSum == rightSum) {height = leftSum;}
            else if(rightSum > leftSum) {height = rightSum;}
            return height;
        }
        else {return -1;}
    }
        
    public boolean isBalanced2(TreeNode root) {
        if(root == null) {return true;}
        int lef = height2(root.left);
        int rig = heigh2(root.right);
    
    }
    
    */

    /*public int height(TreeNode node) {
        if(node == null){return 0;}
        else{ 
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);
            return Math.max(leftHeight, rightHeight);
        }
    }*/

    public int balanceFactor(TreeNode node){
        return height(node.right) - height(node.left);
    }

    public TreeNode rotateLeft(TreeNode node){
        TreeNode rightChild = node.right;
        node.right = rightChild.left;
        rightChild.left = node;
        return rightChild;
    }

    public TreeNode rotateRight(TreeNode node) {
        TreeNode leftChild = node.left;
        node.left = leftChild.right;
        leftChild.right = node;
        return leftChild;
    }

    /*public TreeNode doubleLeft(TreeNode node){

    }

    public TreeNode doubleRight(TreeNode node){
        
    }*/


}

