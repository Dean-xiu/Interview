import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*二叉树的层序遍历*/
public class TreelevelOrder {
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
       ArrayList<ArrayList<Integer>> treeRes=new ArrayList<ArrayList<Integer>>();

       if(root==null)
           return treeRes;
       Queue<TreeNode> queue=new LinkedList<TreeNode>();
       queue.offer(root);
       while(!queue.isEmpty())
       {
           ArrayList<Integer> levelNode=new ArrayList<>();
           int size=queue.size();
           for(int i=0;i<size;i++)
           {
               if(queue.peek().left!=null) //有左孩子压入队列
                   queue.offer(queue.peek().left);
               if(queue.peek().right!=null)
                   queue.offer(queue.peek().right); //有右孩子压入队列
               levelNode.add(queue.poll().val); //取出队头元素 并从队列中移除
           }
           treeRes.add(levelNode);
       }
       return treeRes;
    }
}
