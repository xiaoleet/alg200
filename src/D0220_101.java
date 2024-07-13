public class D0220_101 {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        boolean res = isSymmetric(root);
        System.out.println(res);
    }

    public static boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return backtrack(root.left,root.right);
    }

    public static boolean backtrack(TreeNode left,TreeNode right){
        if(left == null && right == null) return true;
        if(left == null && right!= null) return false;
        if(left != null && right == null) return false;
        if(left.val!=right.val) return false;
       return backtrack(left.left,right.right) && backtrack(left.right,right.left);
    }

}
