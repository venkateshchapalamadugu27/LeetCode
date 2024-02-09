class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        li=[]
        for x in nums1:
            y=x
            for z in nums2:
                if z==y:
                    li.append(z)
                    nums2.remove(z)
                    y=None
                    
        return li