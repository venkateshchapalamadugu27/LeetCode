class Solution {
    public boolean judgeCircle(String moves) {
        int x=0,y=0;

        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U') y++;
            else if(moves.charAt(i)=='D') y--;
            else if(moves.charAt(i)=='L') x--;
            else  x++;
        }

        return x==0 && y==0 ;
    }
}