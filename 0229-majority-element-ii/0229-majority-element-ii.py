class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        new=list(set(nums))
        length=len(nums)//3
        ans=[]
        for i in new:
            if nums.count(i) > length :
                ans.append(i)
        return ans

        