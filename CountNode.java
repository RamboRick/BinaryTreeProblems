package basic05;

public class CountNode {
    public int countNode(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = countNode(root.left);
        int right = countNode(root.right);
        return left+right+1;
    }

    public static void main(String[] args){
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t5.left =t6;
        CountNode sol =new CountNode();
        System.out.print(sol.countNode(t1));
    }

}

