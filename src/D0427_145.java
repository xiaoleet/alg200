import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class D0427_145 {
    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right= new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        List<Integer> res = postorderTraversal(root);
        System.out.println(res);
    }
    //迭代法,用stack
    public static List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) return null;
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()){
            //压入顺序根左右，弹出顺序根右左，反转后左右根
            root = stack.pop();//根
            res.add(root.val);
            if(root.left!=null){//左
                stack.add(root.left);
            }
            if(root.right!=null){//右
                stack.add(root.right);
            }
        }
        Collections.reverse(res);
        return res;
    }
    //递归法
    public static List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        backtrack(root,res);
        return res;
    }

    public static void backtrack(TreeNode root,List<Integer> res){
        if(root == null) return;
        backtrack(root.left,res);
        backtrack(root.right,res);
        res.add(root.val);
    }
}
