class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        s1=set(nums1)
        s2=set(nums2)

        res=[[],[]]

        for x in s1:
            if x not in s2:
                res[0].append(x)

        for x in s2:
            if x not in s1:
                res[1].append(x)

        return res