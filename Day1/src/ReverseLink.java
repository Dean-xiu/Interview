/*nowcoder 反转链表*/
public class ReverseLink {
    public ListNode ReverseList(ListNode head)
    {
        if(head==null)
            return null;
        ListNode newHead=null;
        ListNode curHead=head;
        while(head!=null)
        {
            ListNode tmp=curHead.next; //先保存当前节点的后一个节点
            curHead.next=newHead; //调整指向
            newHead=curHead;  //new移向下一位
            curHead=tmp;   // cur向后移
        }
        return newHead;
    }
}
