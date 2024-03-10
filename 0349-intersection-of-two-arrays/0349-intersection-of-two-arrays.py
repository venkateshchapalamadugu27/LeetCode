class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        li=[]
        for x in nums1:
            y=x
            for z in nums2:
                if z==y:
                    li.append(z)

        li = list(dict.fromkeys(li))
        return li