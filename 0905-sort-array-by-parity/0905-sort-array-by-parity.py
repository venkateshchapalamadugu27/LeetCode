class Solution(object):
    def sortArrayByParity(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        l=[]
        for x in nums:
            if x%2==0:
                l.append(x)
        for x in nums:
            if x%2==1:
                l.append(x)
        return l
        
        