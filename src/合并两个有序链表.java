import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 合并两个有序链表 {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode l3 = new Solution().mergeTwoLists(l1, l2);


        System.out.println();
    }
}


class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        List<ListNode> list = new ArrayList<>();
        foreach(list, list1);
        foreach(list, list2);

        ListNode[] nodes = new ListNode[list.size()];
        list.toArray(nodes);

        //进行冒泡排序
        for (int i = 0; i < nodes.length - 1; i++) {
            for (int j = 0; j < nodes.length - 1 - i; j++) {
                ListNode node = nodes[j];
                ListNode temp = nodes[j + 1];
                if (node.val > temp.val) {
                    nodes[j] = temp;
                    nodes[j + 1] = node;
                }
            }
        }

        ListNode node = null;
        for (int i = 0; i < nodes.length; i++) {
            if (node != null) {
                node.next = nodes[i];
                node = node.next;
            } else {
                node = nodes[i];
            }
        }
        return nodes[0];
    }

    private void foreach(List<ListNode> list, ListNode node) {
        if (node != null) {
            list.add(node);
            ListNode next = node.next;
            if (next != null) {
                foreach(list, next);
            }
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "val=" + val;
    }
}
