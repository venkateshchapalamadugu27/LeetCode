class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.split(" ");
        // System.out.println(Arrays.toString(arr));
        return arr[arr.length-1].length();
    }
}