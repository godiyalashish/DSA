//pointer to the node is given which is to be deleted cannot use head or tail
class Solution {
    public void deleteNode(ListNode node) {
        ListNode t = node.next;
        node.val = t.val;
        node.next = t.next;
    }
}
