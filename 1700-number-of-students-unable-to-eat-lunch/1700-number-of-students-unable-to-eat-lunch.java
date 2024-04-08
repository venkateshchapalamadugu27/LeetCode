class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count=new int[2];
        for(int num:students){
            count[num]++;
        } 
        int remains=sandwiches.length;
        for(int sandwich:sandwiches){
            if(count[sandwich]==0) break;
            if(remains--==0) break;
            count[sandwich]--;
        }       

        return remains;
        
   }
}