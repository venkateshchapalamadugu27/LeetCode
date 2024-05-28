/**
 * The rand7() API is already defined in the parent class SolBase.
 * public int rand7();
 * @return a random integer in the range 1 to 7
 */
class Solution extends SolBase {
    int x=1;
    public int rand10() {
        if(x>=11) 
            x=1;
        return x++;
    }
}