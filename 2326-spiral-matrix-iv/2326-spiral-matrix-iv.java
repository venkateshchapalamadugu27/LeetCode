/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] spiral= new int[m][n];
        for(int i = 0; i < m; i++){
            Arrays.fill(spiral[i], -1);
        }
        int topR = 0, btmR = m-1, lftC = 0, rytC = n-1;
        while(head!=null){
            //Fill Top Row
            for(int col = lftC; col <= rytC && head != null; col++){
                spiral[topR][col] = head.val;
                head = head.next;
            }
            topR++;
            //Fill Right Column
            for(int row = topR; row <= btmR && head != null; row++){
                spiral[row][rytC] = head.val;
                head = head.next;
            }
            rytC--;
            //Fill Bottom Row
            for(int col = rytC; col >= lftC && head != null; col--){
                spiral[btmR][col] = head.val;
                head = head.next;
            }
            btmR--;
            //Fill Left Column
            for(int row = btmR; row >= topR && head != null; row--){
                spiral[row][lftC] = head.val;
                head = head.next;
            }
            lftC++;
        }
        return spiral;
    }
}