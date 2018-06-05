package basic05;

public class IsTwistedIdentical {
    public boolean isTwisted(TreeNode one, TreeNode two){
        if(one == null && two == null){
            return true;
        }
        if(one == null || two == null){
            return false;
        }
        if(one.value != two.value){
            return false;
        }
        return (isTwisted(one.left, two.left) && isTwisted(one.right,two.right)) || (isTwisted(one.left,two.right) && isTwisted(one.right,two.left));
    }
}
