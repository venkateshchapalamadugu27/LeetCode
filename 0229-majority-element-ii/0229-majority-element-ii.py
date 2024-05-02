class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        new=list(set(nums))
        length=len(nums)//3
        ans=[]
        for i in new:
            if nums.count(i) > length :
                ans.append(i)
        return ans