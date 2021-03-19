package Homework.Leetcode.p21;

import java.util.List;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      ListNode cur1 = l1;
      ListNode cur2 = l2;
      ListNode last = new ListNode(-1);
      ListNode newhead = last;
      while(cur1!=null&&cur2!=null){
          if (cur1.val<=cur2.val){
              last.next = cur1;
              last = cur1;
              cur1 = cur1.next;
          }else{
              last.next = cur2;
              last = cur2;
              cur2 = cur2.next;
          }
      }
      if (cur1!=null){
          last.next = cur1;
      }else if (cur2!=null){
          last.next = cur2;
      }
      return newhead.next;
    }
}
