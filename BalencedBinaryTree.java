package basic05;
//space complexity: O(logn) if it is balenced binary tree
//time complextity: O(nlogn)
public class BalencedBinaryTree {
    public boolean isBalenced(TreeNode root){
        if(root == null) return true;
        int left =getHeight(root.left);
        int right = getHeight(root.right);
        if(Math.abs(left - right) > 1){
            return false;
        }
        return isBalenced(root.left)&&isBalenced(root.Right);
    }

    // 第二种方法 为了减少时间复杂度 我们只遍历一遍node
    public boolean isBalenced2(TreeNode root){
        return heightOrUnbalence(root) >= 0;
    }
    // If return value <0, unbalence; otherwise, return hight;
    private int heightOrUnbalence(TreeNode root){
        if(root == null){
            return 0;
        }
        int hLeft = heightOrUnbalence(root.left);
        int hRight = heightOrUnbalence(root.right);
        if(hLeft < 0 || hRight < 0|| Math.abs(hLeft - hRight)>1){
            return -1;
        }
        return Math.max(hLeft,hRight) + 1;
    }
}
