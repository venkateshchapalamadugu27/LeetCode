class Solution {
    public boolean squareIsWhite(String coordinates) {
        int val=coordinates.charAt(0)-'a';
        val=val+Integer.parseInt(String.valueOf(coordinates.charAt(1)));
        System.out.println(val);
        return val%2==0;

    }
}