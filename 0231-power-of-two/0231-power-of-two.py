class Solution(object):
    import math
    def isPowerOfTwo(self, n):
        """
        :type n: int
        :rtype: bool
        """
        for x in range(0,1000):
            if n==math.pow(2,x):
                return True
                
        return False
                