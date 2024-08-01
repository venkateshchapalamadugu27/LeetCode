class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++){
            // int age=Integer.parseInt(details[i].substring(11,13));
            if(Integer.parseInt(details[i].substring(11,13))>60) count++; 
        }
        return count;
    }
}