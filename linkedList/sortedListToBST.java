class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next == null){
            TreeNode base = new TreeNode(head.val, null, null);
            return base;
        }
        
        ListNode fast = head, slow = head,prev=null;
        
        while(fast!=null && fast.next!=null){
            if(head==null || head.next == null){
                slow =head;
                break;
            }
            fast = fast.next.next;
            prev =slow;
            slow = slow.next;
        }
        prev.next = null;
        TreeNode leftRoot = sortedListToBST(head);
        TreeNode rightRoot = sortedListToBST(slow.next);
        TreeNode root = new TreeNode(slow.val, leftRoot, rightRoot);
        
        return root;
    }
}