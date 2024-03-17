class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        li=list(set(nums))
        lis=[]
        for i in li:
            if nums.count(i)==1:
                lis.append(i)
        return lis
