package ecse321;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

    }
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root==null) {
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> result=new ArrayList<Integer>();
        TreeNode temp=root;
        Stack<TreeNode> dfs1=new Stack<TreeNode>();
        Stack<TreeNode> dfs2=new Stack<TreeNode>();
        dfs1.push(root);
        while (!dfs1.empty()) {
            temp=dfs1.pop();
            dfs2.push(temp);
            if (temp.left!=null) {
                dfs1.push(temp.left);
            }
            if (temp.right!=null) {
                dfs1.push(temp.right);
            }
        }
        while (!dfs2.empty()) {
            result.add(dfs2.pop().val);
        }
        return result;
    }
}
