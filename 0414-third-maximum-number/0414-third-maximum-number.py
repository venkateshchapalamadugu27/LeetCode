class Solution(object):
    def thirdMax(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums1=list(set(nums))
        x=len(nums1)
        if x>2:
          nums1.sort(reverse=True)
          return nums1[2]
        elif x<3:
            return max(nums1)