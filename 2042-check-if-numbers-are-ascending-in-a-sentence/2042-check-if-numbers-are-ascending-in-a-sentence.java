
class Solution {
    public boolean areNumbersAscending(String s) {
        String[] arr=s.split("\\s+");
        List<Integer> list=new ArrayList<Integer>();
        for(String word:arr){
            if(isNumeric(word)){
                 list.add(Integer.parseInt(word));
            }
        }
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>=list.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}