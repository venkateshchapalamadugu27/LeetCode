class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        list1=[]
        list2=[]
        for x in nums:
            if x!=0:
                list1.append(x)
            else:
                list2.append(x)
        for x in list2:
                list1.append(x)
        for i in range(0,len(nums)):
            nums[i]=list1[i]
        return nums
