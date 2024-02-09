class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        s=list(set(nums))
        if len(nums)==len(s):
            return False
        else:
            return True
        