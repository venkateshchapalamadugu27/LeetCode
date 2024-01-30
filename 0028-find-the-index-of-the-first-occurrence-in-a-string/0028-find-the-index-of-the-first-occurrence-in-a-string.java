// class Solution {
//     public int strStr(String haystack, String needle) {
//         if(haystack.contains(needle)){
//               int ii=0,j=needle.length()-1;
//               for(int i=ii;i<needle.length()-j;i++){
//                   String res=haystack.substring(i,j+1);
//                   if(res.equals(needle)) return i;
//               }
//         }
//         return -1;
//     }
// }
class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            int j = needle.length();
            for (int i = 0; i <= haystack.length() - j; i++) {
                String res = haystack.substring(i, i + j);
                if (res.equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
