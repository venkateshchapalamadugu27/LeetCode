class Solution {
    public String reverseVowels(String s) {
        //  List<Integer> list = new ArrayList<>();
        // ArrayList<Character> vowels = new ArrayList<>();
        // for (int i = 0; i < s.length(); i++) {
        //     if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
        //         list.add(i);
        //         vowels.add(s.charAt(i));
        //     }
        // }


        // // System.out.println(list);
        // // System.out.println(vowels);
        // // // Collections.sort(vowels);
        // // // System.out.println(vowels);
        // String res="";
        // int j=list.size()-1;
        // for(int i=0;i<s.length();i++){
            
        // if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
        //         res+=vowels.get(j);
        //         j--;
        //     }
        //     else{
        //         res+=s.charAt(i);
        //     }

        // }
        // return res;

        int start=0,end=s.length()-1;
        char[] arr=s.toCharArray();

        while(start<end){
            if(isVowel(s.charAt(start)) && isVowel(s.charAt(end))){
                 char temp=arr[start];
                 arr[start]=arr[end];
                 arr[end]=temp;
                 start++;end--;
            }
            if(!isVowel(s.charAt(start))){
                start++;
            }
            if(!isVowel(s.charAt(end))){
                end--;
            }
        }
         
         return new String(arr);
    }

    private boolean isVowel(char c){
        String vow="aeiouAEIOU";
        return vow.contains(String.valueOf(c));
    }
}