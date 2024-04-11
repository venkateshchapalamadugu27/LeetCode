class Solution {
    public int secondHighest(String s) {
        Set<Integer> set=new HashSet<>();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                set.add(Integer.parseInt(Character.toString(c)));
            }
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        // System.out.println(list);
        Collections.reverse(list);
        return list.size()<=1 ? -1 : list.get(1);
    }
}