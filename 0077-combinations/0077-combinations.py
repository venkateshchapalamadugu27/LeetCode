from itertools import combinations
class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        arr=[]
        for i in range(0,n):
            arr.append(i+1)
        print(arr)
        
        subset=list(combinations(arr,k))
        return subset