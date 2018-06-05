package basic05;
import  java.util.*;
public class TreeTraversal {
    public void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.value);
        preOrder(root.left);
        preOrder(root.right);
    }
    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        preOrder(root.left);
        System.out.println(root.value);
        preOrder(root.right);
    }
    public void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.value);
    }
}

class TreeNode{
    public TreeNode(int v){
        value = v;
    }
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode parent;

}
