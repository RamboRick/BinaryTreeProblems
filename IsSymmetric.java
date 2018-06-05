package basic05;
//time complexity: O(n)
//space complexity: o(logn) worse case linked list O(n)
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root){
        if(root == null){
            return true;
        }
        return isSymmetric(root.left,root.right);
    }

    private boolean isSymmetric(TreeNode a, TreeNode b){
        //case 1. a ,b both null
        // case 2, one of a, b is null
        // case 3, a,b both not null
        if(a==null && b== null){
            return true;
        }
        if(a == null || b == null){
            return false;
        }
        if(a.value != b.value){
            return false;
        }
        return isSymmetric(a.left, b.right) && isSymmetric(a.right,b.left);
    }
}
