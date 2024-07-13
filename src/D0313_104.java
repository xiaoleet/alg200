public class D0313_104 {
    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        int res = maxDepth(root);
        System.out.println(res);
    }
    public static int maxDepth(TreeNode root) {
        return maxDepth(root,0,0);
    }
    public static int maxDepth(TreeNode root,int leftDepth,int rightDepth ){
        if(root == null) return 0;
        leftDepth = maxDepth(root.left,leftDepth,rightDepth)+1;
        rightDepth = maxDepth(root.right,leftDepth,rightDepth)+1;
        return Math.max(leftDepth,rightDepth);
    }
}
