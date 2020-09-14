import java.util.LinkedList;
import java.util.Queue;

/*二叉树的最大深度*/
public class TreeDepth {
    //递归法
    public int maxDepth (TreeNode root) {
        if(root==null)
            return 0;
        int lSize=maxDepth(root.left);
        int rSize=maxDepth(root.right);
        return 1+(lSize>rSize?lSize:rSize);
    }
    //使用队列进行层序遍历
    public int maxDepth1(TreeNode root)
    {
        if(root==null)
            return 0;
        Queue<TreeNode> queue=new LinkedList<>();
        int depth=0;
        queue.add(root);
        while(!queue.isEmpty())
        {
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
                TreeNode node=queue.poll(); //将根节点出队 压入左右孩子节点进队
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
            }
            depth++;
        }
        return depth;
    }
}
