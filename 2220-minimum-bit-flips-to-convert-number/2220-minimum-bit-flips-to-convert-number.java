class Solution {
    public int minBitFlips(int start, int goal) {
        StringBuilder s=new StringBuilder(Integer.toBinaryString(start)),
                      g=new StringBuilder(Integer.toBinaryString(goal));
        
        int count=0,sl=s.length(),gl=g.length();

        // System.out.println(s.toString());
        // System.out.println(g.toString());

        if(sl>gl){
            for(int i=0;i<(sl-gl);i++){
                g.insert(0,"0");
            }
        }
        if(sl<gl){
            for(int i=0;i<(gl-sl);i++){
                s.insert(0,"0");
            }
        }

        //  System.out.println(s.toString());
        //  System.out.println(g.toString());

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=g.charAt(i)) count++;
        }

        return count;
    }
}