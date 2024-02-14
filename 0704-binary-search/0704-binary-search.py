class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        count=0
        for i in range(len(nums)):
            if nums[i]==target:
                count=count+1
                k=i
                break
        if count==1:
            return k
        else:
            return -1
        