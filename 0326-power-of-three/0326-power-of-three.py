class Solution(object):
    def isPowerOfThree(self, n):
        """
        :type n: int
        :rtype: bool
        """
        z=0
        for i in range(0,100):
            if n==3**i:
                z=1
                return True
        return False