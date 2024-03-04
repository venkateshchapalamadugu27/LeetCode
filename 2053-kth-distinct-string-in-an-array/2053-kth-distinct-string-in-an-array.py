class Solution(object):
    def kthDistinct(self, arr, k):
        """
        :type arr: List[str]
        :type k: int
        :rtype: str
        """
        res=[]
        for x in arr:
            if arr.count(x)==1:
                res.append(x)
        # res=res[::-1]
        print(res)
        if len(res)<k:
            return ""
        return res[k-1]
        