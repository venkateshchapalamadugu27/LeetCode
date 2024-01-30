class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        x=len(nums)
        if nums[-1]<target:
            return x
        elif target<=nums[0]:
            y=0
            return int(y)
        else:
            for i in range(0,x+1):
                if nums[i]==target:
                    return int(i+1)
                elif nums[i]<target and nums[i+1]>=target:
                    return int(i+1)