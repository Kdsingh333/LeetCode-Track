https://leetcode.com/problems/middle-of-the-linked-list/description/
class Solution {
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
            size ++;
        }
        if(size%2 == 0){
        for(int i =0; i< Math.floor(size/2); i++){
            head = head.next;
        }
        }else{
            for(int i =0; i<=(size/2); i++){
            head = head.next;
        }}

        return head;
    }
    }