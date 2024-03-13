/**
 * The rand7() API is already defined in the parent class SolBase.
 * public int rand7();
 * @return a random integer in the range 1 to 7
 */
/* We need to return a random number from 1 to 10 based on the condition.So, I initially initialize x to 1.
   If it exceeds 10,I put a condition resets to 1 . Return x++ value.
*/
class Solution extends SolBase {
    int x=1;
    public int rand10() {
        if(x>=11) 
            x=1;
        return x++;
    }
}