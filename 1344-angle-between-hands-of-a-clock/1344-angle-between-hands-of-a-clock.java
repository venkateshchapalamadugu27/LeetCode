class Solution {
    public double angleClock(int hour, int minutes) {
        double anle=Math.abs((30*hour)-(5.5*minutes));
        return Math.min(anle,360-anle);
    }
}