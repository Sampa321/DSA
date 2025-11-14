package ClassPractice.MainTopic.LinkedList.Delete.DeleteFirstNode;

import java.util.Scanner;

public class NodeDelete {
    int data;
    NodeDelete next;
    public NodeDelete(int value)
    {
        this.data = value;
        this.next = null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NodeDelete head = new NodeDelete(23);
        NodeDelete p1 = new NodeDelete(33);
        NodeDelete p2 = new NodeDelete(99);
        NodeDelete p3 = new NodeDelete(883);
       head.next = p1;
       p1.next = p2;
       p2.next = p3;
       head = DeleteFirstNode(head);
       NodeDelete curr = head;
       while (curr!=null)
       {
           System.out.print(curr.data+" ");
           curr = curr.next;
       }
    }
    public static NodeDelete DeleteFirstNode(NodeDelete head) {
        if (head==null)
        {
            return head;
        }
        return head.next;
    }
}
