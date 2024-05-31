class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        li=list(set(nums))
        lis=[]
        for i in li:
            if nums.count(i)==1:
                lis.append(i)
        return lis